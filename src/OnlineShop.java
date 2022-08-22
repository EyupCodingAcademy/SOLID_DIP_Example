public class OnlineShop {

    public DebitCard debitcard;
   // public CreditCard creditcard;

    public OnlineShop(DebitCard debitcard) {
        this.debitcard = debitcard;

    }

  //  public OnlineShop(CreditCard creditcard) {
   //     this.creditcard = creditcard;

    //}

    public void doPayment(int amount) {
        debitcard.makePayment(amount);
        //creditcard.makePayment(amount);

    }











}
