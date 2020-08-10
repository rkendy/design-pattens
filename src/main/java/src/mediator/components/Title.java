package src.mediator.components;

import src.mediator.mediator.Mediator;

public class Title implements Component {

    private Mediator mediator;
    private String title = "";

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Title";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}