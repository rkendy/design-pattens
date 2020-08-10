package src.mediator.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.mediator.mediator.Mediator;

public class ListOfNotes implements Component {

    private Mediator mediator;
    private List<String> list = new ArrayList<>();

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "List";
    }

    public void addElement(String note) {
        list.add(note);
    }

    public List<String> getList() {
        return list;
    }

}