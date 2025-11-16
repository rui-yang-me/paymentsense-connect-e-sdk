package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Response containing available payment methods.
 * <p>
 * This response provides information about which card schemes and digital
 * wallets are supported for payments.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethodsResponse {

    /**
     * List of supported card schemes.
     * <p>
     * Possible values:
     * <ul>
     *   <li>VISA</li>
     *   <li>MASTERCARD</li>
     *   <li>MAESTRO</li>
     *   <li>AMEX</li>
     *   <li>DCI</li>
     *   <li>DISCOVER</li>
     * </ul>
     * </p>
     */
    @JsonProperty("cardSchemes")
    private List<String> cardSchemes;

    /**
     * List of supported digital wallets.
     * <p>
     * Possible values:
     * <ul>
     *   <li>APPLE_PAY</li>
     *   <li>GOOGLE_PAY</li>
     * </ul>
     * </p>
     */
    @JsonProperty("wallets")
    private List<String> wallets;

    /**
     * List of supported digital MITCardSchemes.
     * <p>
     * Possible values:
     * <ul>
     *   <li>VISA</li>
     *   <li>MASTERCARD</li>
     *   <li>MAESTRO</li>
     * </ul>
     * </p>
     */
    @JsonProperty("MITCardSchemes")
    private List<String> MITCardSchemes;

}
