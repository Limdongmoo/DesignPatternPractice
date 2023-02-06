package observerpattern;

import observerpattern.observer.CurrentConditionDisplay;
import observerpattern.observer.ForecastDisplay;
import observerpattern.observer.StatisticDisplay;
import observerpattern.subject.WeatherData;

public class WeatherStationApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(3.2f, 20, 1.99f);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        currentConditionDisplay.display();
        forecastDisplay.display();
        System.out.println("-----------------------------");

        weatherData.setMeasurements(5.2f, 30, 0.99f);
        currentConditionDisplay.display();
        forecastDisplay.display();

        System.out.println("-----------------------------");

        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setMeasurements(80.0f, 30, 0.99f);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticDisplay.display();

        System.out.println("-----------------------------");
        weatherData.setMeasurements(90.0f, 30, 0.99f);
        currentConditionDisplay.display();
        forecastDisplay.display();
        statisticDisplay.display();
    }
}
