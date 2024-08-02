package command;

public class AdjustSpeaker implements Command{
    private Speaker speaker;

    public void AdjustSpeaker(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void execute(){
        speaker.adjustVolume();
    }
}
