package Solution;

public class CreditCard implements PaymentCard{

    public void makePayment(int amount) {
        System.out.println("Payment made with Credit Card for amount " + amount);
    }
}
