package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymentsense.connecte.model.enums.PaymentStatusCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Payment information retrieved from the API.
 *
 * @author Paymentsense SDK Team
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentInfo {
    /**
     * Transaction date and time in ISO 8601 format
     */
    @JsonProperty("transactionDateTime")
    private String transactionDateTime;

    /**
     * Status code of the payment operation.
     * <p>
     * See {@link PaymentStatusCode} for all possible status codes and their
     * meanings.
     * </p>
     */
    @JsonProperty("statusCode")
    private PaymentStatusCode statusCode;

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
     * Billing address
     */
    @JsonProperty("billingAddress")
    private Address billingAddress;

    /**
     * Shipping details
     */
    @JsonProperty("shippingDetails")
    private ShippingDetails shippingDetails;

    /**
     * User email address
     */
    @JsonProperty("userEmailAddress")
    private String userEmailAddress;

    /**
     * Check if the payment was successful.
     *
     * @return true if statusCode indicates success, false otherwise
     */
    public boolean isSuccess() {
        return statusCode != null && statusCode.isSuccessful();
    }

    /**
     * Check if the payment failed.
     *
     * @return true if the status code indicates failure
     */
    public boolean isFailed() {
        return statusCode != null && statusCode.isFailed();
    }

    /**
     * Check if the payment is still in progress.
     *
     * @return true if the status code indicates the payment is in progress
     */
    public boolean isInProgress() {
        return statusCode != null && statusCode.isInProgress();
    }
}
