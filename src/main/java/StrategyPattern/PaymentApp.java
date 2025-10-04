package StrategyPattern;

public  abstract class PaymentApp {
    public abstract void pay(int amount);
}
class CreditCard extends PaymentApp {
    String CreditNo ;
    public CreditCard(String CreditNo) {
        this.CreditNo = CreditNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using CreditCard:"+CreditNo);
    }
}
class DebitCard extends PaymentApp {
    String DebitNo ;
    public DebitCard(String DebitNo) {
        this.DebitNo = DebitNo;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using DebitCard:"+DebitNo);
    }
}
class UPI extends PaymentApp {
    UPIprovider upiType;
    public UPI(UPIprovider upiprovider) {
        this.upiType = upiprovider;
    }
    @Override
    public void pay(int amount) {
        upiType.payStatus(amount);
    }
}
class PayPal extends PaymentApp {
    String PayPalid;
    public PayPal(String PayPalid) {
        this.PayPalid = PayPalid;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using PayPalid:"+PayPalid);
    }
}