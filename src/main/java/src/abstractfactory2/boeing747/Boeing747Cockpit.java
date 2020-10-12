package src.abstractfactory2.boeing747;

import src.abstractfactory2.ICockpit;

public class Boeing747Cockpit implements ICockpit {

    @Override
    public String type() {
        return "Boeing 747 Cockpit";
    }

}
