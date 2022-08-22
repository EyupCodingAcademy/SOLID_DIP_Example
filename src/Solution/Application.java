package Solution;

public class Application {

    public static void main(String[] args){
        PaymentCard card = new CreditCard();
        //PaymentCard card = new DebitCard();
        OnlineShop onlineShop = new OnlineShop(card);
        onlineShop.doPayment(500);

    }
}
