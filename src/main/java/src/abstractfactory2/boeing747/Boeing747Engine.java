package src.abstractfactory2.boeing747;

import src.abstractfactory2.IEngine;

public class Boeing747Engine implements IEngine {
    @Override
    public String type() {
        return "Boeing 747 Engine";
    }
}
