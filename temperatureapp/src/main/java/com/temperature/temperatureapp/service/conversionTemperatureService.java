package com.temperature.temperatureapp.service;

public class conversionTemperatureService {
	
// convert from Celsius	
	
public double convertFromCelsiusToFahrenheitTemperatue(double c) {
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

//convert from Fahrenheit

public double convertFromFahrenheitToCelsiusTemperature(double f) {
	double c= 0;
	c = (f-32)*5/9;
	return c;
}

public double convertFromFahrenheitToKelvinTemperature(double f) {
	double k= 0;
	k = (f+459.67)*5/9;
	return k;
}

public double convertFromFahrenheitToRankineTemperature(double f) {
	double r= 0;
	r = f + 459.67;
	return r;
}

//convert from Kelvin

public double convertFromKelvinToCelsiusTemperature(double k) {
	double c= 0;
	c= k - 273.15;
	return c;
}

public double convertFromKelvinToFahrenheitTemperature(double k) {
	double f= 0;
	f = k *(9/5) - 459.67;
	return f;
}

public double convertFromKelvinToRankineTemperature(double k) {
	double r= 0;
	r = k *(9/5);
	return r;
}

//convert from Rankine

public double convertFromRankineToCelsiusTemperature(double r) {
	double c= 0;
	c = r *(9/5) - 273.15;
	return c;
}

public double convertFromRankineToFahrenheitTemperature(double r) {
	double f= 0;
	f = r - 459.67;
	return f;
}

public double convertFromRankineToKelvinTemperature(double r) {
	double k= 0;
	k = r *(9/5);
	return k;
}


}






