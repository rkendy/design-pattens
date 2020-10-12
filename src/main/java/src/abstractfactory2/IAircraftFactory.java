package src.abstractfactory2;

public interface IAircraftFactory {
    IEngine createEngine();

    IWings createWings();

    ICockpit createCockpit();
}
