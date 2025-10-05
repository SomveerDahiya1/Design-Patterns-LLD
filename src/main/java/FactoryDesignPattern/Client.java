package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
    Burger burger1 = new PrepareBurger("Basic") ;
    burger1.prepare();

    Burger burger2 = new PrepareBurger("Standard") ;
    burger2.prepare();

    Burger burger3 = new PrepareBurger("Premium") ;
    burger3.prepare();
    }
}
