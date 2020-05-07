package src.observer.display;

import src.observer.DisplayElement;
import src.observer.Observer;
import src.observer.Subject;

/**
 * StatisticsDisplay
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
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
        System.out.println("Statistics conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}