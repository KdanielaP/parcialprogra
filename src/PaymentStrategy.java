public interface PaymentStrategy {
    boolean validatePaymentDetails();

    void validate();

    void processPayment(double amount);
}