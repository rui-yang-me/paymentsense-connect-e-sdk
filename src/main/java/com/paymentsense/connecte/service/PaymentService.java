package com.paymentsense.connecte.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.paymentsense.connecte.config.ClientConfig;
import com.paymentsense.connecte.exception.ApiException;
import com.paymentsense.connecte.exception.AuthenticationException;
import com.paymentsense.connecte.exception.PaymentsenseException;
import com.paymentsense.connecte.exception.ValidationException;
import com.paymentsense.connecte.model.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Service for handling HTTP communication with Paymentsense Connect-E API.
 */
public class PaymentService {
    private final ClientConfig config;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    /**
     * Create a new PaymentService with the given configuration.
     *
     * @param config the client configuration
     */
    public PaymentService(ClientConfig config) {
        this.config = config;
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(config.getTimeout())
                .build();

        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    /**
     * Create a payment token.
     *
     * @param paymentToken the payment token request
     * @return the payment token response
     * @throws PaymentsenseException if the request fails
     */
    public PaymentTokenResponse createPaymentToken(PaymentToken paymentToken) throws PaymentsenseException {
        // Validate required fields
        validatePaymentToken(paymentToken);

        // Fill in config defaults for optional fields
        fillConfigDefaults(paymentToken);

        String url = config.getApiUrl() + "/access-tokens";
        String requestBody = serializeToJson(paymentToken);

        HttpRequest request = buildPostRequest(url, requestBody);
        String responseBody = executeRequest(request);

        return deserializeFromJson(responseBody, PaymentTokenResponse.class);
    }

    /**
     * Get payment information by ID.
     *
     * @param paymentId the payment ID (payment token ID)
     * @return the payment information
     * @throws PaymentsenseException if the request fails
     */
    public PaymentInfo getPaymentInfo(String paymentId) throws PaymentsenseException {
        String url = config.getApiUrl() + "/payments/" + paymentId;
        HttpRequest request = buildGetRequest(url);
        String responseBody = executeRequest(request);

        return deserializeFromJson(responseBody, PaymentInfo.class);
    }

    /**
     * Execute a cross-reference payment operation (refund, void, collection).
     *
     * @param paymentToken the payment token ID
     * @param request      the cross-reference payment request
     * @return the cross-reference payment response
     * @throws PaymentsenseException if the request fails
     */
    public CrossReferencePaymentResponse executeCrossReferencePayment(
            String paymentToken,
            CrossReferencePaymentRequest request) throws PaymentsenseException {

        String url = config.getApiUrl() + "/cross-reference-payments/" + paymentToken;
        String requestBody = serializeToJson(request);

        HttpRequest httpRequest = buildPostRequest(url, requestBody);
        String responseBody = executeRequest(httpRequest);

        return deserializeFromJson(responseBody, CrossReferencePaymentResponse.class);
    }

    /**
     * Build an HTTP GET request.
     */
    private HttpRequest buildGetRequest(String url) {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + config.getApiKey())
                .header("Content-Type", "application/json");

        // Add sandbox headers if needed
        String[] sandboxHeaders = buildSandboxHeaders();
        if (sandboxHeaders.length > 0) {
            builder.headers(sandboxHeaders);
        }

        // Add IP forwarding headers if needed
        String[] ipHeaders = buildIpHeaders();
        if (ipHeaders.length > 0) {
            builder.headers(ipHeaders);
        }

        return builder
                .GET()
                .timeout(config.getTimeout())
                .build();
    }

    /**
     * Build an HTTP POST request.
     */
    private HttpRequest buildPostRequest(String url, String body) {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer " + config.getApiKey())
                .header("Content-Type", "application/json");

        // Add sandbox headers if needed
        String[] sandboxHeaders = buildSandboxHeaders();
        if (sandboxHeaders.length > 0) {
            builder.headers(sandboxHeaders);
        }

        // Add IP forwarding headers if needed
        String[] ipHeaders = buildIpHeaders();
        if (ipHeaders.length > 0) {
            builder.headers(ipHeaders);
        }

        return builder
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .timeout(config.getTimeout())
                .build();
    }

    /**
     * Build sandbox headers if sandbox mode is enabled.
     */
    private String[] buildSandboxHeaders() {
        if (config.isSandbox()) {
            return new String[] { "IS-SANDBOX", "true" };
        }
        return new String[] {};
    }

    /**
     * Build IP forwarding headers if user IP is configured.
     */
    private String[] buildIpHeaders() {
        if (config.getUserIpAddress() != null && !config.getUserIpAddress().isEmpty()) {
            return new String[] { "X-Forwarded-For", config.getUserIpAddress() };
        }
        return new String[] {};
    }

    /**
     * Execute an HTTP request and return the response body.
     */
    private String executeRequest(HttpRequest request) throws PaymentsenseException {
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();

            if (statusCode == 200) {
                return body;
            } else if (statusCode == 401 || statusCode == 403) {
                throw new AuthenticationException("Authentication failed: " + body);
            } else {
                throw new ApiException("API request failed: " + body, statusCode);
            }
        } catch (IOException e) {
            throw new PaymentsenseException("Network error: " + e.getMessage(), e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new PaymentsenseException("Request interrupted: " + e.getMessage(), e);
        }
    }

    /**
     * Serialize an object to JSON.
     */
    private String serializeToJson(Object object) throws PaymentsenseException {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new PaymentsenseException("Failed to serialize request: " + e.getMessage(), e);
        }
    }

    /**
     * Deserialize JSON to an object.
     */
    private <T> T deserializeFromJson(String json, Class<T> clazz) throws PaymentsenseException {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new PaymentsenseException("Failed to deserialize response: " + e.getMessage(), e);
        }
    }

    /**
     * Validate required fields for payment token.
     *
     * @param token the payment token to validate
     * @throws ValidationException if any required field is missing or empty
     */
    private void validatePaymentToken(PaymentToken token) throws ValidationException {
        if (token == null) {
            throw new ValidationException("Payment token cannot be null");
        }

        // Validate merchant URL (required)
        if (token.getMerchantUrl() == null || token.getMerchantUrl().isEmpty()) {
            throw new ValidationException("Merchant URL is required and cannot be empty");
        }

        // Validate currency code (required, ISO 4217 numeric code)
        if (token.getCurrencyCode() == null || token.getCurrencyCode().isEmpty()) {
            throw new ValidationException("Currency code is required and cannot be empty");
        }
        if (!token.getCurrencyCode().matches("^\\d{3}$")) {
            throw new ValidationException("Currency code must be a 3-digit ISO 4217 numeric code (e.g., 826 for GBP)");
        }

        // Validate amount (required, numeric)
        if (token.getAmount() == null || token.getAmount().isEmpty()) {
            throw new ValidationException("Amount is required and cannot be empty");
        }
        if (!token.getAmount().matches("^\\d+$")) {
            throw new ValidationException("Amount must be numeric in minor currency units (e.g., pence)");
        }

        // Validate transaction type (required)
        if (token.getTransactionType() == null) {
            throw new ValidationException("Transaction type is required and cannot be null");
        }

        // Validate order ID (required)
        if (token.getOrderId() == null || token.getOrderId().isEmpty()) {
            throw new ValidationException("Order ID is required and cannot be empty");
        }
    }

    /**
     * Fill in configuration defaults for optional fields.
     * Note: merchantUrl is now required and must be provided by the caller.
     *
     * @param token the payment token to fill
     */
    private void fillConfigDefaults(PaymentToken token) {
        // Fill webhook URL from config if not provided
        if (token.getWebhookUrl() == null && config.getWebhookUrl() != null) {
            token.setWebhookUrl(config.getWebhookUrl());
        }

        // Fill gateway credentials from config if not provided
        if (token.getGatewayUsername() == null && config.getGatewayUsername() != null) {
            token.setGatewayUsername(config.getGatewayUsername());
        }
        if (token.getGatewayPassword() == null && config.getGatewayPassword() != null) {
            token.setGatewayPassword(config.getGatewayPassword());
        }
    }
}
