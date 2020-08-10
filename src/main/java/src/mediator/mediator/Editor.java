package src.mediator.mediator;

import src.mediator.components.AddButton;
import src.mediator.components.Component;
import src.mediator.components.ListOfNotes;
import src.mediator.components.Title;

public class Editor implements Mediator {

    private AddButton add;
    private ListOfNotes list;
    private Title title;

    @Override
    public void addNewNote(String note) {
        list.addElement(note);
        title.setTitle("Last added: " + note);
    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "AddButton":
                add = (AddButton) component;
                break;
            case "List":
                list = (ListOfNotes) component;
                break;
            case "Title":
                title = (Title) component;
            default:
                break;
        }
    }

}