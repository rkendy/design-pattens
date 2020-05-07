package src.command.concretecommand;

import src.command.Command;
import src.command.receptor.CeilingFan;

/**
 * CeilingFanCommand
 */
public abstract class CeilingFanCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}