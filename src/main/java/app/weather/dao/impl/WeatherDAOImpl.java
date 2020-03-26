package app.weather.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.weather.dao.WeatherDAO;
import app.weather.model.Weather;

@Repository
public class WeatherDAOImpl implements WeatherDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void updateWeather(Weather weather) {
		// TODO Auto-generated method stub
		String sql = "UPDATE myweather SET temp = ?, humid = ?, date = ?, time = ? WHERE id = 1";
		jdbcTemplate.update(sql, weather.getTemp(), weather.getHumid(), weather.getDate(), weather.getTime());
	}

	@Override
	public Weather getWeather() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM myweather WHERE id = 1";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Weather>(){

			@Override
			public Weather mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Weather weather = new Weather();
				weather.setId(rs.getInt(1));
				weather.setTemp(rs.getString(2));
				weather.setHumid(rs.getString(3));
				weather.setDate(rs.getString(4));
				weather.setTime(rs.getString(5));
				return weather;
			}
			
		});
	}


}
