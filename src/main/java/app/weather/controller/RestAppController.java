package app.weather.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import app.weather.model.Weather;
import app.weather.service.WeatherService;

@CrossOrigin
@RestController
public class RestAppController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/api/weather")
	public Weather getWeather() {
		Weather weather = weatherService.getWeather();
		return weather;
	}
	
	@GetMapping("/api/weather/temp")
	public String getTemp() {
		Weather weather = weatherService.getWeather();
		return weather.getTemp();
	}
	
	@GetMapping("/api/weather/humid")
	public String getHumid() {
		Weather weather = weatherService.getWeather();
		return weather.getHumid();
	}
	
	@GetMapping("/api/weather/date")
	public String getDate() {
		Weather weather = weatherService.getWeather();
		return weather.getDate();
	}
	
	@GetMapping("/api/weather/time")
	public String getTime() {
		Weather weather = weatherService.getWeather();
		return weather.getTime();
	}
	
	@PostMapping("/api/weather/update")
	@ResponseStatus(code = HttpStatus.OK)
	public void updateWeather(@RequestBody Weather weather) {
		long nowOther = System.currentTimeMillis();
        Date date = new Date(nowOther + (7*60*60*1000));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
		weather.setDate(dateFormat.format(date));
		weather.setTime(timeFormat.format(date));
		weatherService.updateWeather(weather);
	}
	
	@GetMapping("/api/weather/update/query")
	public void updateWeather(@RequestParam(name = "temp") String temp, @RequestParam(name = "humid") String humid) {
		Weather weather = new Weather();
		long nowOther = System.currentTimeMillis();
        Date date = new Date(nowOther + (7*60*60*1000));
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
		weather.setDate(dateFormat.format(date));
		weather.setTime(timeFormat.format(date));
		weather.setTemp(temp);
		weather.setHumid(humid);
		weatherService.updateWeather(weather);
	}
}
