package com.paymentsense.connecte.exception;

/**
 * Exception thrown when authentication fails.
 * Typically occurs when the API key is invalid, expired, or missing.
 */
public class AuthenticationException extends PaymentsenseException {
    /**
     * Create an AuthenticationException with a message.
     *
     * @param message the error message
     */
    public AuthenticationException(String message) {
        super(message, "AUTHENTICATION_FAILED", 401);
    }

    /**
     * Create an AuthenticationException with a message and cause.
     *
     * @param message the error message
     * @param cause   the underlying cause
     */
    public AuthenticationException(String message, Throwable cause) {
        super(message, "AUTHENTICATION_FAILED", 401, cause);
    }
}
