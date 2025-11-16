package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymentsense.connecte.model.enums.PaymentStatusCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response from resuming a payment.
 * <p>
 * This is returned when calling the Resume Payment endpoint to resume
 * a payment that was previously paused or requires additional action.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResumePaymentResponse {

    /**
     * Status code of the payment operation.
     * <p>
     * See {@link PaymentStatusCode} for all possible status codes and their meanings.
     * </p>
     */
    @JsonProperty("statusCode")
    private PaymentStatusCode statusCode;

    /**
     * Authorization code from the payment gateway.
     * <p>
     * This will be present for successful transactions.
     * </p>
     */
    @JsonProperty("authCode")
    private String authCode;

    /**
     * Message providing details about the payment status.
     * <p>
     * This provides a human-readable description of the transaction result.
     * </p>
     */
    @JsonProperty("message")
    private String message;

    /**
     * Check if the payment was successful.
     *
     * @return true if the status code indicates success
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
