package paymentEx;

// 기준이 '없음'이므로 추상 메서드, final로 선언된 변수와 default로 접근제어자가 선언된 구상메서드, static
public interface Refundable {
    void refund();
}
