package src.abstractfactory2.boeing747;

import src.abstractfactory2.IWings;

public class Boeing747Wings implements IWings {
    @Override
    public String type() {
        return "Boeing 747 Wings";
    }
}
