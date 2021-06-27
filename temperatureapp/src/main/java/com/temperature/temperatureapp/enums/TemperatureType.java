package com.temperature.temperatureapp.enums;

public enum TemperatureType {
	CELSIUM("CELSIUM"),
	FAHREINT("FAHREINT"),
	KELVINE("KELVINE"),
	RANKINE("RANKINE"); 
	
	private final String temperature;
	
	TemperatureType(String temperature){
		this.temperature = temperature;
	
	}
	
	public String getTemperature() {
		return temperature;
	}
	

}
