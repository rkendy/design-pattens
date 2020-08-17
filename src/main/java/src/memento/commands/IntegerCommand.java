package src.memento.commands;

import src.memento.editor.Editor;

public class IntegerCommand implements Command {
    private Editor editor;
    private Integer value;

    public IntegerCommand(Editor editor, Integer value) {
        this.editor = editor;
        this.value = value;
    }

    @Override
    public void execute() {
        editor.setIntegerComponent(value);
    }

    @Override
    public String getName() {
        return "Integer: " + value;
    }

}