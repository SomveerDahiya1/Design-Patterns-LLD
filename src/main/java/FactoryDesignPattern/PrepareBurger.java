package FactoryDesignPattern;

public class PrepareBurger extends Burger{
  BurgerTypes burger ;
  BurgerFactory burgerFactory = new BurgerFactory();

  public PrepareBurger(String burgerType)
  {
      this.burger = burgerFactory.burgerType(burgerType);
  }
    @Override
    public void prepare() {
        this.burger.makeBurger();
    }
}
