package com.paymentsense.connecte.exception;

/**
 * Exception thrown when request validation fails.
 * Occurs when required fields are missing or invalid.
 */
public class ValidationException extends PaymentsenseException {
    /**
     * Create a ValidationException with a message.
     *
     * @param message the error message
     */
    public ValidationException(String message) {
        super(message, "VALIDATION_ERROR", 400);
    }

    /**
     * Create a ValidationException with a message and cause.
     *
     * @param message the error message
     * @param cause   the underlying cause
     */
    public ValidationException(String message, Throwable cause) {
        super(message, "VALIDATION_ERROR", 400, cause);
    }

    /**
     * Create a ValidationException for a specific field.
     *
     * @param fieldName the name of the invalid field
     * @param reason    the reason for validation failure
     * @return a ValidationException
     */
    public static ValidationException forField(String fieldName, String reason) {
        return new ValidationException(
            String.format("Validation failed for field '%s': %s", fieldName, reason)
        );
    }
}
