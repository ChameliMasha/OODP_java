package strategy;

public abstract class Duck {
    protected FlyBehaviour flybehaviour;
    
    //constructor
    public Duck(FlyBehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public void performFly() {
        flybehaviour.fly();
    }
}
