package src.memento;

import src.memento.commands.StringCommand;
import src.memento.editor.Editor;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.execute(new StringCommand(editor, "Um valor"));
        editor.execute(new StringCommand(editor, "Outro valor"));
        editor.undo();
        editor.execute(new StringCommand(editor, "Outro valor2"));
        editor.execute(new StringCommand(editor, "Outro valor3"));
        editor.execute(new StringCommand(editor, "Outro valor4"));
        editor.undo();
        editor.execute(new StringCommand(editor, "Outro valor5"));
        editor.undo();

    }

}