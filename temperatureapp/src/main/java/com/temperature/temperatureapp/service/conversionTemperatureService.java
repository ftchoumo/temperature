package com.temperature.temperatureapp.service;
public class conversionTemperatureService {
	
public double convertFromCelsiusToFahreintTemperatue(double c) {
		double f =0;
		f = c *(9/5) +32;
		return f;		
	}
	
public double convertFromCelsiusToKelvineTemperatue(double c) {
		
		double k =0;
		k = c +273.15;
		return k;
		
	}
public double convertFromCelsiusToRankineTemperatue(double c) {
	
	double r =0;
	r = c *(9/5) +491.67;
	return r;
	
}
	
public double convertFromFahreintToCelsiusTemperature(double f) {
	double c= 0;
	c = (f-32)*5/9;
	return c;
}

}
