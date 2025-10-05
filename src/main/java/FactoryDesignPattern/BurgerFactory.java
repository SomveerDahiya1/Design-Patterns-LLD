package FactoryDesignPattern;

public class BurgerFactory {
    BurgerTypes burgerType(String name)
    {
        if(name.equals("Basic"))
        {
            return new BasicBurger();
        }
        else if (name.equals("Standard")) {
            return new StandardBurger();
        }
        else if (name.equals("Premium")) {
            return new PremiumBurger();
        }
        else
        {
            return null ;
        }
    }

}
