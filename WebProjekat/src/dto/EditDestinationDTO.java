package dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EditDestinationDTO {
	@NotBlank private String oldName;
	@NotBlank private String name;
	@NotBlank private String state;
	@NotBlank private String airportName;
	@NotBlank private String airportCode;
	@NotNull private Float lat;
	@NotNull private Float log;
	@NotNull private Boolean archived;

	public EditDestinationDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLog() {
		return log;
	}

	public void setLog(Float log) {
		this.log = log;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

}