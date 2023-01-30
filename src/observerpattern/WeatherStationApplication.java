package observerpattern;

import observerpattern.observer.CurrentConditionDisplay;
import observerpattern.subject.WeatherData;

public class WeatherStationApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(5.2f, 30, 0.99f);


    }
}
