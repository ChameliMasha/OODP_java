package template;

class BurgerMaker extends FoodMaker{

    @Override
    void putBase(){
        System.out.println("The chicken patty is put");
    }

    @Override
    void putFilling(){
        System.out.println("The salad leaves are kept");
    }

    @Override
    void serving(){
        System.out.println("Put on a plate and served");
    }
}
