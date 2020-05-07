package src.command.concretecommand;

import src.command.Command;
import src.command.receptor.GarageDoor;

/**
 * GarageDoorOpenCommand
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();

    }

    @Override
    public void undo() {
        garageDoor.close();
    }

}