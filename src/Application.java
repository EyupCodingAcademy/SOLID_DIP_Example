public class Application {

    public static void main(String[] args){
        DebitCard debitcard = new DebitCard();
        //CreditCard creditcard = new CreditCard();
        OnlineShop onlineShop = new OnlineShop(debitcard);
        //OnlineShop onlineShop = new OnlineShop(creditcard);
        onlineShop.doPayment(500);

    }
}
