# Paymentsense Connect-E Java SDK

Official Java SDK for integrating Paymentsense Connect-E payment gateway.

## Features

- Simple and intuitive API
- Full type safety with enums
- Built with Java 11+
- Minimal dependencies (only Jackson for JSON)
- Complete API coverage
- Production-ready with comprehensive error handling

## Requirements

- Java 11+
- Maven 3.6+

## Installation

### Maven

```xml
<dependency>
    <groupId>com.paymentsense</groupId>
    <artifactId>connect-e-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

### Initialize the Client

```java
PaymentsenseClient client = PaymentsenseClient.builder()
    .apiKey("your-api-key")
    .environment(Environment.TEST)
    .sandbox(true)
    .build();
```

### Create a Payment

```java
PaymentToken token = PaymentToken.builder()
    .amount("100")  // £1.00 in pence
    .currency(CurrencyCode.GBP)
    .transactionType(TransactionType.SALE)
    .orderId("ORDER-12345")
    .userEmailAddress("customer@example.com")
    .build();

PaymentTokenResponse response = client.createPaymentToken(token);
```

### Query Payment Status

```java
PaymentInfo info = client.getPaymentInfo(response.getId());

if (info.isSuccess()) {
    System.out.println("Payment successful!");
}
```

## Configuration

```java
PaymentsenseClient client = PaymentsenseClient.builder()
    .apiKey("your-jwt-token")
    .environment(Environment.PRODUCTION)
    .sandbox(false)
    .timeout(Duration.ofSeconds(60))
    .webhookUrl("https://your-domain.com/webhook")
    .build();
```

## Examples

### Refunding a Payment

```java
PaymentInfo payment = client.getPaymentInfo("payment-id");

CrossReferencePaymentResponse refund = client.refundPayment(
    "payment-id",
    payment.getCrossReference()
);
```

### Recurring Payments

```java
COFSetup cofSetup = COFSetup.builder()
    .intendedAmount("999")
    .type(COFType.RECURRING)
    .terms("Monthly subscription")
    .build();

PaymentToken token = PaymentToken.builder()
    .amount("999")
    .currency(CurrencyCode.GBP)
    .cofSetup(cofSetup)
    .build();
```

## Error Handling

```java
try {
    PaymentTokenResponse response = client.createPaymentToken(token);
} catch (AuthenticationException e) {
    // Invalid API key
} catch (ValidationException e) {
    // Request validation failed
} catch (ApiException e) {
    // API returned an error
} catch (PaymentsenseException e) {
    // Generic error
}
```

## Documentation

See the [examples](src/main/java/com/paymentsense/connecte/examples/) directory for complete examples:
- BasicPaymentExample.java
- RecurringPaymentExample.java
- RefundExample.java

## Support

- Documentation: https://docs.connect.paymentsense.cloud
- Issues: https://github.com/paymentsense/connect-e-sdk/issues

## License

Provided by Paymentsense.
