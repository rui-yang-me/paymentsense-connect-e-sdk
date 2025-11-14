package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Address information.
 *
 * @author Paymentsense SDK Team
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    /**
     * Address line 1
     */
    @JsonProperty("address1")
    private String address1;

    /**
     * Address line 2
     */
    @JsonProperty("address2")
    private String address2;

    /**
     * Address line 3
     */
    @JsonProperty("address3")
    private String address3;

    /**
     * Address line 4
     */
    @JsonProperty("address4")
    private String address4;

    /**
     * City
     */
    @JsonProperty("city")
    private String city;

    /**
     * State/Province
     */
    @JsonProperty("state")
    private String state;

    /**
     * Postal code
     */
    @JsonProperty("postcode")
    private String postcode;

    /**
     * Country code (ISO 3166-1 alpha-2)
     */
    @JsonProperty("countryCode")
    private String countryCode;
}
