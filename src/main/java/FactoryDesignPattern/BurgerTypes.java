package FactoryDesignPattern;

public abstract class BurgerTypes  {
public abstract void makeBurger();
}
class BasicBurger extends BurgerTypes {
    @Override
    public void makeBurger() {
        System.out.println("Burger ready with Bun,patty and cheese.");
    }
}
class StandardBurger extends BurgerTypes {
    @Override
    public void makeBurger() {
        System.out.println("Burger ready with brown bun,patty,pule cheese and veggies.");
    }
}
class PremiumBurger extends BurgerTypes {
    @Override
    public void makeBurger() {
        System.out.println("Burger ready with premium bun,Cabrales blue cheese and caviar topping.");
    }
}