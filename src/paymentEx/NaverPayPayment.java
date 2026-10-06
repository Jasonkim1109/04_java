package paymentEx;

public class NaverPayPayment extends Payment implements Refundable {
    NaverPayPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        displayAmount();
        System.out.println("네이버페이로 결제합니다.");
    }

    @Override
    public void refund() {
        displayAmount();
        System.out.println("원 환불을 진행합니다.");
    }
}
