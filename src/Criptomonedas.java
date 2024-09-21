public class Criptomonedas implements PaymentStrategy {
    private String walletAddress;

    public Criptomonedas(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean validatePaymentDetails() {
        // Lógica de validación de criptomonedas
        return true; // Implementa la validación real aquí
    }

    @Override
    public void processPayment(double amount) {
        // Lógica para procesar el pago con criptomonedas
        System.out.println("Procesando pago de " + amount + " a través de criptomonedas.");
    }
}
