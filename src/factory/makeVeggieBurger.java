package factory;

public class makeVeggieBurger implements burgerFactory{
    @Override
    public Burger makeBurger(){
        return new veggieBurger();
    }
}
