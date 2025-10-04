package StrategyPattern;

public class Client {
    public static void main(String[] args) {
     PaymentApp pay1 = new Pay(new CreditCard("1345-4528-9999"));
     pay1.pay(500);

     PaymentApp pay2 = new Pay(new UPI(new Gpay("19038971097")));
     pay2.pay(900);

     PaymentApp pay3 = new Pay(new PayPal("somveer@paypal.com"));
     pay3.pay(700);

    }
}
