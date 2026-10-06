package paymentEx;

public final class PaymentProcessor {
    private PaymentProcessor() {
    }

    public static void process(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("결제 수단은 null일 수 없습니다.");
        }
        payment.processPayment();
    }
}
