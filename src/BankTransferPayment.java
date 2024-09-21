public class BankTransfer implements PaymentMethod {
    private String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void validate() {
        // Lógica de validación de transferencia bancaria
        System.out.println("Validating Bank Transfer...");
        // Aquí iría la validación real
    }

    @Override
    public void processPayment(double amount) {
        // Lógica de procesamiento de pago
        System.out.println("Processing Bank Transfer Payment of: " + amount);
    }
}