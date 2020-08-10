package src.mediator.mediator;

import src.mediator.components.Component;

public interface Mediator {

    void addNewNote(String note);

    void registerComponent(Component component);
}