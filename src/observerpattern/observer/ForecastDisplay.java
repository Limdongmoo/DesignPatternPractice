package observerpattern.observer;

import observerpattern.subject.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {

    private WeatherData weatherData;
    private float currentPressure = 2.99f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("이전 기압 : " + lastPressure);
        System.out.println("현재 기압 : " + currentPressure);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }


}
