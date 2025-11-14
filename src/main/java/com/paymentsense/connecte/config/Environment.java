package com.paymentsense.connecte.config;

import lombok.Getter;

/**
 * Paymentsense Connect-E environment configuration.
 * Defines the API and Web URLs for production and test environments.
 */
@Getter
public enum Environment {
    /**
     * Production environment - real payments
     */
    PRODUCTION(
        "https://e.connect.paymentsense.cloud/v1",
        "https://web.e.connect.paymentsense.cloud",
        "https://cdn.dojo.tech"
    ),

    /**
     * Test/Sandbox environment - for testing and development
     */
    TEST(
        "https://e.test.connect.paymentsense.cloud/v1",
        "https://web.e.test.connect.paymentsense.cloud",
        "https://cdn.dojo.tech/test"
    );

    /**
     * The API base URL for Connect-E REST API endpoints
     */
    private final String apiUrl;

    /**
     * The Web base URL for Connect-E SDK scripts
     */
    private final String webUrl;

    /**
     * The CDN base URL for Dojo SDK scripts
     */
    private final String cdnUrl;

    Environment(String apiUrl, String webUrl, String cdnUrl) {
        this.apiUrl = apiUrl;
        this.webUrl = webUrl;
        this.cdnUrl = cdnUrl;
    }
}
