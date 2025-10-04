package StrategyPattern;

public abstract class UPIprovider {
    abstract void payStatus(int amount);
}
class Gpay extends UPIprovider {
    String gpayID;
    public Gpay(String gpayID) {
        this.gpayID = gpayID;
    }
    @Override
    void payStatus(int amount) {
        System.out.println(amount+" paid using GpayID:"+gpayID);
    }
}
class Paytm extends UPIprovider {
    String paymID;
    public Paytm(String paymID) {
        this.paymID = paymID;
    }
    @Override
    void payStatus(int amount) {
        System.out.println(amount+" paid using PaymID:"+paymID);
    }
}