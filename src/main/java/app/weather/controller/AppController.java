package app.weather.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import app.weather.model.Weather;
import app.weather.service.WeatherService;

@Controller
public class AppController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		Weather weather = weatherService.getWeather();
		request.setAttribute("weather", weather);
		return "index";
	}
	
	@GetMapping("/redirect")
	public String redirectHome(HttpServletRequest request) {
		Weather weather = weatherService.getWeather();
		request.setAttribute("weather", weather);
		return "index";
	}
}
