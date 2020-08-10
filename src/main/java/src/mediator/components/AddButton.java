package src.mediator.components;

import src.mediator.mediator.Mediator;

public class AddButton implements Component {
    private Mediator mediator;

    public AddButton() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "AddButton";
    }

    public void fireAction(String note) {
        mediator.addNewNote(note);
    }

}