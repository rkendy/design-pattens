package src.command;

/**
 * Command
 */
public interface Command {

    public void execute();

    public default void undo() {
    };
}