package Strategy;

public class main {
    public static void main(String[] args) {
        // Create a shopping cart
        Cart cart = new Cart();

        // Use Credit Card payment strategy
        PaymentStrategy creditCard = new CreditCard(12345678, "John Doe");
        cart.setPayStrategy(creditCard);
        cart.checkout(1000);

        // Use UPI payment strategy
        PaymentStrategy upi = new UPI("Jane Doe", "janedoe@upi");
        cart.setPayStrategy(upi);
        cart.checkout(500);
    }
}
