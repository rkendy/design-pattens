package src.abstractfactory2.f16;

import src.abstractfactory2.ICockpit;

public class F16Cockpit implements ICockpit {
    @Override
    public String type() {
        return "F16 Cockpit";
    }
}
