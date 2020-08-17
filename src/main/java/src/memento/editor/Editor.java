package src.memento.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import src.memento.commands.Command;
import src.memento.editor.history.History;
import src.memento.editor.history.Memento;

public class Editor {
    private History history;
    private String componentStr;
    private Integer componentInt;

    public Editor() {
        history = new History();
        componentStr = "Default value";
        componentInt = 0;
    }

    public void setStringComponent(String value) {
        componentStr = value;
    }

    public void setIntegerComponent(Integer value) {
        componentInt = value;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo()) {
            print();
        }
    }

    public void redo() {
        if (history.redo()) {
            print();
        }
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.componentStr);
            oos.writeObject(this.componentInt);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.componentStr = (String) ois.readObject();
            this.componentInt = (Integer) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }

    public void print() {
        System.out.println("=== Editor:");
        System.out.println("=== Str: " + componentStr);
        System.out.println("=== Int: " + componentInt);
        System.out.println("============");
    }

}