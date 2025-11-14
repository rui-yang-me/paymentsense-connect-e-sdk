package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Shipping details information.
 *
 * @author Paymentsense SDK Team
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingDetails {
    /**
     * Recipient name
     */
    @JsonProperty("Name")
    private String name;

    /**
     * Shipping address
     */
    @JsonProperty("Address")
    private Address address;
}
