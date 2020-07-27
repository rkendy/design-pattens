package src.builder;

import src.builder.builders.CarBuilder;
import src.builder.builders.CarManualBuilder;
import src.builder.cars.Car;
import src.builder.cars.Manual;
import src.builder.director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}