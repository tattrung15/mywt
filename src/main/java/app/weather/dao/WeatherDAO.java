package app.weather.dao;

import app.weather.model.Weather;

public interface WeatherDAO {

	public void updateWeather(Weather weather);
	
	public Weather getWeather();
}
