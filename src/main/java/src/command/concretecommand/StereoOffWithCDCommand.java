package src.command.concretecommand;

import src.command.Command;
import src.command.receptor.Stereo;

/**
 * StereoOffWithCDCommand
 */
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

}