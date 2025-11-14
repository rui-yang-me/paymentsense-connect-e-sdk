package com.paymentsense.connecte.exception;

/**
 * Exception thrown when the Paymentsense API returns an error.
 */
public class ApiException extends PaymentsenseException {
    /**
     * Create an ApiException with a message and status code.
     *
     * @param message    the error message
     * @param statusCode the HTTP status code
     */
    public ApiException(String message, int statusCode) {
        super(message, "API_ERROR", statusCode);
    }

    /**
     * Create an ApiException with full details.
     *
     * @param message    the error message
     * @param errorCode  the error code from API
     * @param statusCode the HTTP status code
     */
    public ApiException(String message, String errorCode, int statusCode) {
        super(message, errorCode, statusCode);
    }

    /**
     * Create an ApiException with a message, status code and cause.
     *
     * @param message    the error message
     * @param statusCode the HTTP status code
     * @param cause      the underlying cause
     */
    public ApiException(String message, int statusCode, Throwable cause) {
        super(message, "API_ERROR", statusCode, cause);
    }
}
