package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response from a cross-reference payment operation.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossReferencePaymentResponse {
    /**
     * Status code (0 = success, other values indicate errors)
     */
    @JsonProperty("statusCode")
    private Integer statusCode;

    /**
     * Authorization code from the payment gateway
     */
    @JsonProperty("authCode")
    private String authCode;

    /**
     * Human-readable message about the operation
     */
    @JsonProperty("message")
    private String message;

    /**
     * Check if the operation was successful.
     *
     * @return true if statusCode is 0, false otherwise
     */
    public boolean isSuccess() {
        return statusCode != null && statusCode == 0;
    }
}
