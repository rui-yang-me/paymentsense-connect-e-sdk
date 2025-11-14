package com.paymentsense.connecte;

import com.paymentsense.connecte.config.ClientConfig;
import com.paymentsense.connecte.config.Environment;
import com.paymentsense.connecte.exception.PaymentsenseException;
import com.paymentsense.connecte.model.*;
import com.paymentsense.connecte.service.PaymentService;
import lombok.Getter;

import java.time.Duration;

/**
 * Main client for interacting with Paymentsense Connect-E API.
 * <p>
 * This is the primary entry point for the SDK. Use the builder to create
 * a configured client instance.
 * </p>
 *
 * <h3>Example Usage:</h3>
 * <pre>{@code
 * PaymentsenseClient client = PaymentsenseClient.builder()
 *     .apiKey("your-api-key")
 *     .environment(Environment.TEST)
 *     .build();
 *
 * PaymentToken token = PaymentToken.builder()
 *     .amount("100")
 *     .currency(CurrencyCode.GBP)
 *     .orderId("order-123")
 *     .build();
 *
 * PaymentTokenResponse response = client.createPaymentToken(token);
 * }</pre>
 */
public class PaymentsenseClient {
    @Getter
    private final ClientConfig config;
    private final PaymentService paymentService;

    /**
     * Create a new client with the given configuration.
     *
     * @param config the client configuration
     */
    private PaymentsenseClient(ClientConfig config) {
        config.validate();
        this.config = config;
        this.paymentService = new PaymentService(config);
    }

    /**
     * Create a payment token for initiating a new payment.
     * <p>
     * The payment token is used by the Connect-E frontend SDK to render
     * the payment form and process the payment.
     * </p>
     *
     * @param paymentToken the payment token request
     * @return the payment token response containing the token ID
     * @throws PaymentsenseException if the request fails
     */
    public PaymentTokenResponse createPaymentToken(PaymentToken paymentToken) throws PaymentsenseException {
        return paymentService.createPaymentToken(paymentToken);
    }

    /**
     * Get payment information by payment ID.
     * <p>
     * Use this to retrieve details about a completed payment, including
     * transaction status, card details, and authorization codes.
     * </p>
     *
     * @param paymentId the payment ID (same as payment token ID)
     * @return the payment information
     * @throws PaymentsenseException if the request fails
     */
    public PaymentInfo getPaymentInfo(String paymentId) throws PaymentsenseException {
        return paymentService.getPaymentInfo(paymentId);
    }

    /**
     * Execute a cross-reference payment operation (refund, void, or collection).
     * <p>
     * This is used for post-payment operations like refunding a payment,
     * voiding an authorization, or collecting a pre-authorized amount.
     * </p>
     *
     * @param paymentToken the original payment token ID
     * @param request      the cross-reference payment request
     * @return the cross-reference payment response
     * @throws PaymentsenseException if the request fails
     */
    public CrossReferencePaymentResponse executeCrossReferencePayment(
            String paymentToken,
            CrossReferencePaymentRequest request) throws PaymentsenseException {
        return paymentService.executeCrossReferencePayment(paymentToken, request);
    }

    /**
     * Refund a payment.
     * <p>
     * Convenience method for refunding a payment using its cross-reference ID.
     * </p>
     *
     * @param paymentToken    the original payment token ID
     * @param crossReference  the cross-reference ID from the payment
     * @return the refund response
     * @throws PaymentsenseException if the request fails
     */
    public CrossReferencePaymentResponse refundPayment(String paymentToken, String crossReference)
            throws PaymentsenseException {
        CrossReferencePaymentRequest request = CrossReferencePaymentRequest.builder()
            .crossReference(crossReference)
            .build();
        return executeCrossReferencePayment(paymentToken, request);
    }

    /**
     * Create a new client builder.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for creating a PaymentsenseClient instance.
     */
    public static class Builder {
        private String apiKey;
        private Environment environment = Environment.TEST;
        private Duration timeout = Duration.ofSeconds(30);
        private boolean sandbox = false;
        private String gatewayUsername;
        private String gatewayPassword;
        private String merchantUrl;
        private String webhookUrl;
        private String userIpAddress;

        /**
         * Set the API key (JWT token).
         *
         * @param apiKey the API key
         * @return this builder
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Set the environment (PRODUCTION or TEST).
         *
         * @param environment the environment
         * @return this builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Set the HTTP request timeout.
         *
         * @param timeout the timeout duration
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Enable or disable sandbox mode.
         *
         * @param sandbox true to enable sandbox mode
         * @return this builder
         */
        public Builder sandbox(boolean sandbox) {
            this.sandbox = sandbox;
            return this;
        }

        /**
         * Set the gateway username (required for non-CyberSource gateways).
         *
         * @param gatewayUsername the gateway username
         * @return this builder
         */
        public Builder gatewayUsername(String gatewayUsername) {
            this.gatewayUsername = gatewayUsername;
            return this;
        }

        /**
         * Set the gateway password (required for non-CyberSource gateways).
         *
         * @param gatewayPassword the gateway password
         * @return this builder
         */
        public Builder gatewayPassword(String gatewayPassword) {
            this.gatewayPassword = gatewayPassword;
            return this;
        }

        /**
         * Set the merchant URL (required for CyberSource gateway).
         *
         * @param merchantUrl the merchant URL
         * @return this builder
         */
        public Builder merchantUrl(String merchantUrl) {
            this.merchantUrl = merchantUrl;
            return this;
        }

        /**
         * Set the default webhook URL for payment notifications.
         *
         * @param webhookUrl the webhook URL
         * @return this builder
         */
        public Builder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }

        /**
         * Set the user IP address to include in requests.
         *
         * @param userIpAddress the user IP address
         * @return this builder
         */
        public Builder userIpAddress(String userIpAddress) {
            this.userIpAddress = userIpAddress;
            return this;
        }

        /**
         * Build the PaymentsenseClient instance.
         *
         * @return a configured PaymentsenseClient
         * @throws IllegalArgumentException if configuration is invalid
         */
        public PaymentsenseClient build() {
            ClientConfig config = ClientConfig.builder()
                .apiKey(apiKey)
                .environment(environment)
                .timeout(timeout)
                .sandbox(sandbox)
                .gatewayUsername(gatewayUsername)
                .gatewayPassword(gatewayPassword)
                .merchantUrl(merchantUrl)
                .webhookUrl(webhookUrl)
                .userIpAddress(userIpAddress)
                .build();

            return new PaymentsenseClient(config);
        }
    }
}
