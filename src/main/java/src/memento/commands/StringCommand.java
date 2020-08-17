package src.memento.commands;

import src.memento.editor.Editor;

public class StringCommand implements Command {
    private Editor editor;
    private String value;

    public StringCommand(Editor editor, String value) {
        this.editor = editor;
        this.value = value;
    }

    @Override
    public void execute() {
        editor.setStringComponent(value);
    }

    @Override
    public String getName() {
        return "Text: " + value;
    }

}