package src.abstractfactory2;

import src.abstractfactory2.f16.F16Cockpit;
import src.abstractfactory2.f16.F16Engine;
import src.abstractfactory2.f16.F16Wings;

public class F16Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new F16Engine();
    }

    @Override
    public IWings createWings() {
        return new F16Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }

}
