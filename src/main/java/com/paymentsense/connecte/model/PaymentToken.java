package com.paymentsense.connecte.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paymentsense.connecte.model.enums.CurrencyCode;
import com.paymentsense.connecte.model.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Payment token request for creating a new payment session.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentToken {
    /**
     * Merchant URL (required for CyberSource gateway)
     */
    @JsonProperty("merchantUrl")
    private String merchantUrl;

    /**
     * ISO 4217 numeric currency code
     * pattern: ^\d\d\d$
     * The three digit ISO- 4217 currency code for the currency. eg 826 for the
     * United Kingdom
     */
    @JsonProperty("currencyCode")
    private String currencyCode;

    /**
     * Payment amount in minor currency units (e.g., pence for GBP)
     * Example: "100" represents £1.00
     * pattern: ^\d+$
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * Transaction type (SALE, PREAUTH, REFUND, COLLECTION, VOID)
     * Use enum for type safety
     */
    @JsonProperty("transactionType")
    private TransactionType transactionType;

    /**
     * Transaction source identifier
     * pattern: ^(MOTO)|()$
     */
    @JsonProperty("transactionSource")
    private String transactionSource;

    /**
     * A merchant side ID for the order
     */
    @JsonProperty("orderId")
    private String orderId;

    /**
     * Human-readable order description
     */
    @JsonProperty("orderDescription")
    private String orderDescription;

    /**
     * Merchant generated transaction ID to uniquely identify the transaction. If
     * included must be unique for each access token
     */
    @JsonProperty("merchantTransactionId")
    private String merchantTransactionId;

    /**
     * User agent string from the customer's browser
     */
    @JsonProperty("userAgent")
    private String userAgent;

    /**
     * User's email address
     */
    @JsonProperty("userEmailAddress")
    private String userEmailAddress;

    /**
     * User's phone number
     */
    @JsonProperty("userPhoneNumber")
    private String userPhoneNumber;

    /**
     * User's IP address
     */
    @JsonProperty("userIpAddress")
    private String userIpAddress;

    /**
     * User address line 1
     */
    @JsonProperty("userAddress1")
    private String userAddress1;

    /**
     * User address line 2
     */
    @JsonProperty("userAddress2")
    private String userAddress2;

    /**
     * User address line 3
     */
    @JsonProperty("userAddress3")
    private String userAddress3;

    /**
     * User address line 4
     */
    @JsonProperty("userAddress4")
    private String userAddress4;

    /**
     * User city
     */
    @JsonProperty("userCity")
    private String userCity;

    /**
     * User state/province
     */
    @JsonProperty("userState")
    private String userState;

    /**
     * User postal code
     */
    @JsonProperty("userPostcode")
    private String userPostcode;

    /**
     * User country code (ISO 3166-1 alpha-2)
     */
    @JsonProperty("userCountryCode")
    private String userCountryCode;

    /**
     * Shipping details including recipient name and address
     */
    @JsonProperty("shippingDetails")
    private ShippingDetails shippingDetails;

    /**
     * Indicates if this is a new transaction (false for cross-reference
     * transactions)
     */
    @JsonProperty("newTransaction")
    private Boolean newTransaction;

    /**
     * Cross reference from a previous transaction for linked/repeat payments
     */
    @JsonProperty("crossReference")
    private String crossReference;

    /**
     * Webhook URL for payment status notifications
     */
    @JsonProperty("webhookUrl")
    private String webhookUrl;

    /**
     * Custom metadata key-value pairs
     */
    @JsonProperty("metaData")
    private Map<String, String> metaData;

    /**
     * Wait for pre-execute hook
     */
    @JsonProperty("waitPreExecute")
    private Boolean waitPreExecute;

    /**
     * Customer identifier
     */
    @JsonProperty("customerId")
    private String customerId;

    /**
     * Builder with convenience methods for setting enums.
     */
    public static class PaymentTokenBuilder {
        /**
         * Set currency code using enum.
         *
         * @param currency the currency code enum
         * @return the builder
         */
        public PaymentTokenBuilder currency(CurrencyCode currency) {
            this.currencyCode = currency.getNumber();
            return this;
        }
    }
}
