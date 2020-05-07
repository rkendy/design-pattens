package src.command.concretecommand;

import src.command.Command;
import src.command.receptor.Stereo;

/**
 * GarageDoorOpenCommand
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

}