package src.mediator;

import src.mediator.components.AddButton;
import src.mediator.components.ListOfNotes;
import src.mediator.components.Title;
import src.mediator.mediator.Editor;
import src.mediator.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Editor();
        AddButton addButton = new AddButton();
        ListOfNotes list = new ListOfNotes();
        Title title = new Title();
        mediator.registerComponent(addButton);
        mediator.registerComponent(list);
        mediator.registerComponent(title);

        // Simulate pressing button:
        addButton.fireAction("Some Item 1");
        addButton.fireAction("Some Item 2");
        addButton.fireAction("Some Item 3");

        // Check if list was updated:
        list.getList().forEach(System.out::println);

        // Check if title was updated:
        System.out.println(title.getTitle());

    }

}