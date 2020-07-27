package src.builder.builders;

import src.builder.cars.Type;
import src.builder.components.Engine;
import src.builder.components.GPSNavigator;
import src.builder.components.Transmission;
import src.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}