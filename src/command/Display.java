package command;

public class Display implements Device{
    @Override
    public void turnOn(){
        System.out.println("The Tv is turned ON");
    }

    @Override
    public void turnOff(){
        System.out.println("The Tv is turned OFF");
    }

    public void adjustBrightness(){
        System.out.println("The brightness of the TV is adjusted");
    }
}
