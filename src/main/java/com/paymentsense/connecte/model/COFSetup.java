package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymentsense.connecte.model.enums.COFType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Card-on-File (COF) setup configuration for recurring payments.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class COFSetup {
    /**
     * The intended amount for future transactions (in minor currency units, e.g., pence)
     */
    @JsonProperty("intendedAmount")
    private String intendedAmount;

    /**
     * The intended date for the first execution
     */
    @JsonProperty("intendedExecutionDate")
    private LocalDateTime intendedExecutionDate;

    /**
     * The expiry date of the COF setup
     */
    @JsonProperty("expiryDate")
    private LocalDateTime expiryDate;

    /**
     * The type of COF setup (RECURRING, INSTALLMENT, or UNSCHEDULED)
     */
    @JsonProperty("type")
    private COFType type;

    /**
     * Terms and conditions for the COF setup
     */
    @JsonProperty("terms")
    private String terms;
}
