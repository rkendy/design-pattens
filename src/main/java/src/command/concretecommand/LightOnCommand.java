package src.command.concretecommand;

import src.command.Command;
import src.command.receptor.Light;

/**
 * LightOnCommand
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}