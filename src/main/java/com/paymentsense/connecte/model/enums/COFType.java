package com.paymentsense.connecte.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Card-on-File (COF) setup types for recurring payments.
 */
@Getter
public enum COFType {
    /**
     * RECURRING - Regular recurring payments (e.g., monthly subscriptions)
     */
    RECURRING("RECURRING"),

    /**
     * INSTALLMENT - Installment payments (e.g., split payments over time)
     */
    INSTALLMENT("INSTALLMENT"),

    /**
     * UNSCHEDULED - Unscheduled Card-on-File payments
     */
    UNSCHEDULED("UNSCHEDULED");

    @JsonValue
    private final String value;

    COFType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
