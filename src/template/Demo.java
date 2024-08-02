package template;

public class Demo {
    public static void main(String[] args){
        System.out.println("Making a burger");
        FoodMaker makeBurger = new BurgerMaker();
        makeBurger.makeFood();

        System.out.println("\nMaking a pizza");
        FoodMaker makePizza = new PizzaMaker();
        makePizza.makeFood();
    }
}
