package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.Date;

public class ExpirationDate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private String timezoneType;
	private String timezone;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTimezoneType() {
		return timezoneType;
	}
	public void setTimezoneType(String timezoneType) {
		this.timezoneType = timezoneType;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
}
