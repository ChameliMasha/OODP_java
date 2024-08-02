package command;

public class Demo {
    public static void main(String[] args){

        //create a speaker
        Speaker speaker = new Speaker();

        //create command objects
        Command turnOnCommand = new TurnOnCommand(speaker);
        Command turnOffCommand = new TurnOffCommand(speaker);

        //create remote control
        Invoker remote = new Invoker();

        //set and execute commands
        remote.setCommand(turnOnCommand);
        remote.pressButton();
        remote.setCommand(turnOffCommand);
        remote.pressButton();

        //create a display
        Display display = new Display();
        Command chanegBrightness = new ChanegBrightness(display);
        remote.setCommand(chanegBrightness);
        remote.pressButton();


    }
}
