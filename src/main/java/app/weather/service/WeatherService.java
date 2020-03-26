package app.weather.service;

import app.weather.model.Weather;

public interface WeatherService {

	public void updateWeather(Weather weather);
	
	public Weather getWeather();
}
