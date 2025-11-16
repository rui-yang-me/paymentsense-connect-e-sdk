package com.paymentsense.connecte.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Payment status codes returned by the Paymentsense Connect-E API.
 * <p>
 * These status codes indicate the current state and result of a payment transaction.
 * </p>
 */
@Getter
public enum PaymentStatusCode {
    /**
     * Status Code 0: The transaction was successful
     */
    SUCCESSFUL(0, "Successful", "The transaction was successful"),

    /**
     * Status Code 3: The card holder has not completed 3DS
     * This status will only be seen on the REST API
     */
    AUTHORIZING(3, "Authorizing", "The card holder has not completed 3DS, this status will only be seen on the REST API"),

    /**
     * Status Code 4: The card issuer has parked the transaction
     * Awaiting contact with the customer before proceeding to authorise or decline
     */
    REFERRED(4, "Referred", "The card issuer has parked the transaction awaiting contact with the customer before proceeding to authorise or decline the transaction"),

    /**
     * Status Code 5: The transaction was declined
     */
    DECLINED(5, "Declined", "The transaction was declined by the card issuer or acquiring bank"),

    /**
     * Status Code 20: Duplicate transaction detected
     * Ensure each transaction has a unique OrderId
     */
    DUPLICATE_TRANSACTION(20, "Duplicate Transaction", "The transaction which was processed was a duplicate. Ensure each transaction has a unique OrderId"),

    /**
     * Status Code 30: Error executing transaction
     */
    FAILED(30, "Failed", "Error executing transaction"),

    /**
     * Status Code 40: The transaction is currently being processed
     * This status will only be seen from the REST API if called before the JavaScript promise resolves or the Webhook is called
     */
    PROCESSING(40, "Processing", "The transaction is currently being processed, please check status again. This status will only be seen from the REST API if called before the JavaScript promise resolves or the Webhook is called"),

    /**
     * Status Code 90: The access token was revoked
     * The access token was revoked while the cardholder was completing 3DS authentication
     */
    REVOKED(90, "Revoked", "The access token was revoked while the cardholder was completing 3DS authentication. The transaction was stopped before being sent for processing"),

    /**
     * Status Code 99: Waiting for pre-execute
     * The transaction has been paused pre-execution using the waitPreExecute flag
     */
    WAITING_PRE_EXECUTE(99, "Waiting Pre-execute", "The transaction has been paused pre-execution using the waitPreExecute flag; a call to resume the transaction is expected within 15 minutes"),

    /**
     * Status Code 400: Invalid request
     * The request has failed validation by our servers
     */
    INVALID_REQUEST(400, "Invalid Request", "The request has failed validation by our servers and the transaction has not been submitted to the gateway. Possible causes for this are invalid transaction type or other data in the request"),

    /**
     * Status Code 401: Issue with access token
     * The access token being used is not valid
     */
    ISSUE_WITH_ACCESS_TOKEN(401, "Issue with Access Token", "The access token being used is not valid, the transaction has not been submitted to the gateway. This can be caused if the access token has already been used or the 30 minute expiry time has elapsed"),

    /**
     * Status Code 404: No access token supplied
     */
    NO_ACCESS_TOKEN_SUPPLIED(404, "No Access Token Supplied", "No access token has been supplied to Connect-E. Transaction has not been submitted to the gateway"),

    /**
     * Status Code 500: Internal server error
     */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "There's been an error submitting the transaction, please check the REST API for the status of the transaction");

    @JsonValue
    private final int code;
    private final String result;
    private final String description;

    PaymentStatusCode(int code, String result, String description) {
        this.code = code;
        this.result = result;
        this.description = description;
    }

    /**
     * Get the status code enum from the numeric code value.
     *
     * @param code the numeric status code
     * @return the corresponding PaymentStatusCode enum
     * @throws IllegalArgumentException if the code is not recognized
     */
    @JsonCreator
    public static PaymentStatusCode fromCode(int code) {
        for (PaymentStatusCode status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown payment status code: " + code);
    }

    /**
     * Check if this status indicates a successful transaction.
     *
     * @return true if the status is SUCCESSFUL
     */
    public boolean isSuccessful() {
        return this == SUCCESSFUL;
    }

    /**
     * Check if this status indicates a failed transaction.
     *
     * @return true if the status is DECLINED, FAILED, or any error status
     */
    public boolean isFailed() {
        return this == DECLINED || this == FAILED || this == INVALID_REQUEST
                || this == ISSUE_WITH_ACCESS_TOKEN || this == NO_ACCESS_TOKEN_SUPPLIED
                || this == INTERNAL_SERVER_ERROR;
    }

    /**
     * Check if this status indicates the transaction is still in progress.
     *
     * @return true if the status is AUTHORIZING, PROCESSING, or WAITING_PRE_EXECUTE
     */
    public boolean isInProgress() {
        return this == AUTHORIZING || this == PROCESSING || this == WAITING_PRE_EXECUTE;
    }

    @Override
    public String toString() {
        return code + " - " + result;
    }
}
