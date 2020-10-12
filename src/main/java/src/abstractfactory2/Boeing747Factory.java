package src.abstractfactory2;

import src.abstractfactory2.boeing747.Boeing747Cockpit;
import src.abstractfactory2.boeing747.Boeing747Engine;
import src.abstractfactory2.boeing747.Boeing747Wings;

public class Boeing747Factory implements IAircraftFactory {

    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

}
