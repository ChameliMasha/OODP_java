package command;

public class Speaker implements Device{
    @Override
    public void turnOn(){
        System.out.println("The Speaker is On");
    }

    @Override
    public void turnOff(){
        System.out.println("The Speaker is Off");
    }

    public void adjustVolume(){
        System.out.println("The Speaker volume is reduced");
    }
}
