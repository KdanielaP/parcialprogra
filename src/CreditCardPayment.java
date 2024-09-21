public abstract class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void validate() {
        // Lógica de validación de tarjeta de crédito
        System.out.println("Validating Credit Card " + cardNumber + "...");
        // Aquí iría la validación real
    }

    @Override
    public void processPayment(double amount) {
        // Lógica de procesamiento de pago
        System.out.println("Processing Credit Card Payment of: " + amount);
    }
}