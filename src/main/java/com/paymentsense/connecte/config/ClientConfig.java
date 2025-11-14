package com.paymentsense.connecte.config;

import lombok.Builder;
import lombok.Data;

import java.time.Duration;

/**
 * Configuration for the Paymentsense Connect-E client.
 */
@Data
@Builder
public class ClientConfig {
    /**
     * API key (JWT token) for authentication
     */
    private final String apiKey;

    /**
     * Environment (PRODUCTION or TEST)
     */
    @Builder.Default
    private final Environment environment = Environment.TEST;

    /**
     * HTTP request timeout
     */
    @Builder.Default
    private final Duration timeout = Duration.ofSeconds(30);

    /**
     * Whether to use sandbox mode (adds IS-SANDBOX header)
     */
    @Builder.Default
    private final boolean sandbox = false;

    /**
     * Gateway username (required for non-CyberSource gateways)
     */
    private final String gatewayUsername;

    /**
     * Gateway password (required for non-CyberSource gateways)
     */
    private final String gatewayPassword;

    /**
     * Merchant URL (required for CyberSource gateway)
     */
    private final String merchantUrl;

    /**
     * Default webhook URL for payment notifications
     */
    private final String webhookUrl;

    /**
     * User IP address to include in requests
     */
    private final String userIpAddress;

    /**
     * Validate the configuration.
     *
     * @throws IllegalArgumentException if configuration is invalid
     */
    public void validate() {
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalArgumentException("API key is required");
        }
        if (environment == null) {
            throw new IllegalArgumentException("Environment is required");
        }
    }

    /**
     * Get the API base URL for this configuration.
     *
     * @return the API URL
     */
    public String getApiUrl() {
        return environment.getApiUrl();
    }

    /**
     * Get the Web base URL for this configuration.
     *
     * @return the Web URL
     */
    public String getWebUrl() {
        return environment.getWebUrl();
    }

    /**
     * Get the CDN base URL for this configuration.
     *
     * @return the CDN URL
     */
    public String getCdnUrl() {
        return environment.getCdnUrl();
    }
}
