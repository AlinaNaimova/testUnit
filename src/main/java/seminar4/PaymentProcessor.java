package seminar4;

public class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount) {
        return gateway.processPayment(amount);
    }
}
