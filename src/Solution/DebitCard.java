package Solution;

public class DebitCard implements PaymentCard {
    public void makePayment(int amount) {
        System.out.println("Payment made with Debit Card for amount " + amount);
    }
}
