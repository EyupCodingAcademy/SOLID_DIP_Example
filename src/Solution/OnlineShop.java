package Solution;

public class OnlineShop {
    public PaymentCard card;

    public OnlineShop(PaymentCard card) {
        this.card = card;

    }
    public void doPayment(int amount) {
        card.makePayment(amount);
    }
}
