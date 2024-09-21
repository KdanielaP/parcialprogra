public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Supongamos que el cliente elige pagar con tarjeta de crédito
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "12/25", "123") {
            @Override
            public boolean validatePaymentDetails() {
                return false;
            }
        };
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(100.0);

        // El cliente elige pagar con PayPal
        PaymentStrategy paypalPayment = new Paypal("cliente@example.com");
        paymentContext.setPaymentStrategy(paypalPayment);
        paymentContext.executePayment(200.0);

        // Continuar con otros métodos de pago...
    }
}