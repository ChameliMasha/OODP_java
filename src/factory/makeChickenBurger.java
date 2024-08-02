package factory;

public class makeChickenBurger implements burgerFactory{
    @Override
    public Burger makeBurger(){
        return new chickenBurger();
    }
}
