package src;

import src.command.Command;
import src.command.MacroCommand;
import src.command.RemoteControll;
import src.command.SimpleRemoteControl;
import src.command.concretecommand.CeilingFanHighCommand;
import src.command.concretecommand.CeilingFanLowCommand;
import src.command.concretecommand.CeilingFanMediumCommand;
import src.command.concretecommand.CeilingFanOffCommand;
import src.command.concretecommand.GarageDoorCloseCommand;
import src.command.concretecommand.GarageDoorOpenCommand;
import src.command.concretecommand.LightOffCommand;
import src.command.concretecommand.LightOnCommand;
import src.command.concretecommand.StereoOffWithCDCommand;
import src.command.concretecommand.StereoOnWithCDCommand;
import src.command.receptor.CeilingFan;
import src.command.receptor.GarageDoor;
import src.command.receptor.Light;
import src.command.receptor.Stereo;
import src.observer.WeatherData;
import src.observer.display.CurrentConditionsDisplay;
import src.observer.display.ForecastDisplay;
import src.observer.display.StatisticsDisplay;

/**
 * ObserverTest
 */
public class ObserverTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }

}