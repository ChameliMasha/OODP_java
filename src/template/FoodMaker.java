package template;

abstract class FoodMaker {
    public final void makeFood(){
        kneeDough();
        putBase();
        putFilling();
        serving();
    }

    abstract void putBase();
    abstract void putFilling();
    abstract void serving();

    void kneeDough(){
        System.out.println("The dough is kneed");
    }

}
