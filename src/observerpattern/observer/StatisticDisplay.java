package observerpattern.observer;

import observerpattern.subject.WeatherData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StatisticDisplay implements DisplayElement, Observer {

    private List<Float> temperatures = new ArrayList<>();
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double average = temperatures.stream().mapToDouble(x -> x)
                .average().getAsDouble();
        double highest = temperatures.stream().mapToDouble(x -> x)
                .max().getAsDouble();
        double lowest = temperatures.stream().mapToDouble(x -> x)
                .min().getAsDouble();

        System.out.println("평균/최고/최저 온도 = " +average + " / " + highest + " / " + lowest);
    }

    @Override
    public void update() {
        temperatures.add(weatherData.getTemperature());
    }
}
