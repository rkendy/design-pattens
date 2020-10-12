package src.abstractfactory2.f16;

import src.abstractfactory2.IEngine;

public class F16Engine implements IEngine {
    @Override
    public String type() {
        return "F16 Engine";
    }
}
