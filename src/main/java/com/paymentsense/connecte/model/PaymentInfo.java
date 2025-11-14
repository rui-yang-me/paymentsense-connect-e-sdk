package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Payment information retrieved from the API.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfo {
    /**
     * Transaction date and time in ISO 8601 format
     */
    @JsonProperty("transactionDateTime")
    private String transactionDateTime;

    /**
     * Status code (0 = success, other values indicate errors)
     */
    @JsonProperty("statusCode")
    private Integer statusCode;

    /**
     * Human-readable message about the transaction
     */
    @JsonProperty("message")
    private String message;

    /**
     * Cross-reference ID for the transaction (used for refunds/voids)
     */
    @JsonProperty("crossReference")
    private String crossReference;

    /**
     * Authorization code from the payment gateway
     */
    @JsonProperty("authCode")
    private String authCode;

    /**
     * Masked card number (e.g., ************1234)
     */
    @JsonProperty("cardNumber")
    private String cardNumber;

    /**
     * Card expiry date (format: MM/YY)
     */
    @JsonProperty("expiryDate")
    private String expiryDate;

    /**
     * Card type (e.g., VISA, MASTERCARD, AMEX)
     */
    @JsonProperty("cardType")
    private String cardType;

    /**
     * Cardholder name
     */
    @JsonProperty("cardName")
    private String cardName;

    /**
     * Check if the payment was successful.
     *
     * @return true if statusCode is 0, false otherwise
     */
    public boolean isSuccess() {
        return statusCode != null && statusCode == 0;
    }
}
