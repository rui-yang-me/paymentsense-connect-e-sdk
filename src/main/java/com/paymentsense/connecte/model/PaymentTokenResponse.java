package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response from creating a payment token.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTokenResponse {
    /**
     * The unique payment token ID (also used as access token)
     */
    @JsonProperty("id")
    private String id;

    /**
     * Unix timestamp when the token expires
     */
    @JsonProperty("expiresAt")
    private Long expiresAt;
}
