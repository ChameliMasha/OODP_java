package template;

public class PizzaMaker extends FoodMaker{
    @Override
    void putBase(){
        System.out.println("Put the chicken and sausages");
    }

    @Override
    void putFilling(){
        System.out.println("Put a cheese layer");
    }

    @Override
    void serving(){
        System.out.println("Cut into pieces and put to a box");
    }
}
