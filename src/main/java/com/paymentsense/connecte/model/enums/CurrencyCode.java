package com.paymentsense.connecte.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * ISO 4217 currency codes supported by Paymentsense Connect-E.
 * The value represents the numeric currency code.
 */
@Getter
public enum CurrencyCode {
    /**
     * GBP - British Pound Sterling (826)
     */
    GBP("826"),

    /**
     * EUR - Euro (978)
     */
    EUR("978"),

    /**
     * USD - United States Dollar (840)
     */
    USD("840");

    @JsonValue
    private final String code;

    CurrencyCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    /**
     * Get CurrencyCode from numeric code string.
     *
     * @param code the numeric currency code (e.g., "826")
     * @return the corresponding CurrencyCode
     * @throws IllegalArgumentException if code is not supported
     */
    public static CurrencyCode fromCode(String code) {
        for (CurrencyCode currency : values()) {
            if (currency.code.equals(code)) {
                return currency;
            }
        }
        throw new IllegalArgumentException("Unsupported currency code: " + code);
    }
}
