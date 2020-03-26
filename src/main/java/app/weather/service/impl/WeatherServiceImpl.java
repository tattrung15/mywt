package app.weather.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.weather.dao.WeatherDAO;
import app.weather.model.Weather;
import app.weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private WeatherDAO weatherDAO;

	@Override
	public void updateWeather(Weather weather) {
		// TODO Auto-generated method stub
		weatherDAO.updateWeather(weather);
	}

	@Override
	public Weather getWeather() {
		// TODO Auto-generated method stub
		return weatherDAO.getWeather();
	}
	
	
}
