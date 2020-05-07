package src.observer.display;

import src.observer.DisplayElement;
import src.observer.Observer;
import src.observer.Subject;

/**
 * ForecastDisplay
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}