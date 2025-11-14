package com.paymentsense.connecte.exception;

import lombok.Getter;

/**
 * Base exception for all Paymentsense Connect-E SDK errors.
 */
@Getter
public class PaymentsenseException extends Exception {
    /**
     * Optional error code
     */
    private final String errorCode;

    /**
     * HTTP status code if applicable
     */
    private final Integer statusCode;

    /**
     * Create a PaymentsenseException with a message.
     *
     * @param message the error message
     */
    public PaymentsenseException(String message) {
        super(message);
        this.errorCode = null;
        this.statusCode = null;
    }

    /**
     * Create a PaymentsenseException with a message and cause.
     *
     * @param message the error message
     * @param cause   the underlying cause
     */
    public PaymentsenseException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = null;
        this.statusCode = null;
    }

    /**
     * Create a PaymentsenseException with a message, error code and status code.
     *
     * @param message    the error message
     * @param errorCode  the error code
     * @param statusCode the HTTP status code
     */
    public PaymentsenseException(String message, String errorCode, Integer statusCode) {
        super(message);
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }

    /**
     * Create a PaymentsenseException with full details.
     *
     * @param message    the error message
     * @param errorCode  the error code
     * @param statusCode the HTTP status code
     * @param cause      the underlying cause
     */
    public PaymentsenseException(String message, String errorCode, Integer statusCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.statusCode = statusCode;
    }
}
