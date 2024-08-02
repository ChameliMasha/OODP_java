package command;

public class ChanegBrightness implements Command{
    private Display display;

    public  ChanegBrightness(Display display){
        this.display = display;
    }

    @Override
    public void execute(){
        display.adjustBrightness();
    }
}
