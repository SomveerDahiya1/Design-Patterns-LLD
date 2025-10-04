package StrategyPattern;

public class Pay extends PaymentApp {
    PaymentApp payment ;
    public Pay(PaymentApp payment) {
        this.payment = payment;
    }
    @Override
    public void pay(int amount)
    {
        payment.pay(amount);
    }
}
