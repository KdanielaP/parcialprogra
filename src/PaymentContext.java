public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Detalles de pago no válidos.");
        }
    }
}