package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request for cross-reference payment operations (refund, void, collection).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CrossReferencePaymentRequest {
    /**
     * Cross-reference ID from the original payment
     */
    @JsonProperty("crossReference")
    private String crossReference;

    /**
     * Card verification value (CVV/CV2) - required for some operations
     */
    @JsonProperty("cv2")
    private String cv2;
}
