package com.paymentsense.connecte.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Transaction type for payment operations.
 */
@Getter
public enum TransactionType {
    /**
     * SALE - Immediate charge transaction
     * The amount is captured immediately
     */
    SALE("SALE"),
    /**
     * REFUND - Refund transaction
     * Returns funds to the customer for a previous transaction
     */
    REFUND("REFUND"),
    /**
     * COLLECTION - Collection transaction
     * Used to collect funds at a later time
     */
    COLLECTION("COLLECTION"),
    /**
     * VOID - Void transaction
     * Cancels a previous transaction before settlement
     */
    VOID("VOID"),
    /**
     * PREAUTH - Pre-authorization transaction
     * Reserves the amount for later capture
     */
    PREAUTH("PREAUTH");

    @JsonValue
    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
