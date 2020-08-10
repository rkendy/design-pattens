package src.mediator.components;

import src.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}