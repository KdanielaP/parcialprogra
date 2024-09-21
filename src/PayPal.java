public class Paypal implements PaypalPayment {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean validatePaymentDetails() {
        // Lógica de validación
        return email.contains("@");
    }

    @Override
    public void processPayment(double amount) {
        // Lógica de procesamiento de pagos
        System.out.println("Procesando pago de " + amount + " utilizando PayPal.");
    }
}