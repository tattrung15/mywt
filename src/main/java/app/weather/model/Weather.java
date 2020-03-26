package app.weather.model;

public class Weather {

	private int id;
	private String temp;
	private String humid;
	private String date;
	private String time;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTemp() {
		return temp;
	}
	
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	public String getHumid() {
		return humid;
	}
	
	public void setHumid(String humid) {
		this.humid = humid;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
