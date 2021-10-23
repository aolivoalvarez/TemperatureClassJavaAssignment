package TemperatureProgram;
//class that takes a temperature in fahrenheit and converts it to celcius and kelvin
public class Temperature {

	private double ftemp; //fahrenheit temp
	private double ctemp; //celcius temp
	private double ktemp; //kelvin temp
	
	public Temperature(double temp) { //constructor that takes fahrenheit temp
		ftemp = temp;
	}
	
	public void setFahrenheit(double temp) { //sets fahrenheit temp
		ftemp = temp;
	}
	
	public double getFahrenheit() { //returns fahrenheit temp
		return ftemp;
	}
	
	public double calcCelsius() { //calculates + returns celcius temp
		ctemp = (5.0/9.0) * (ftemp - 32);
		return ctemp;
	}
	
	public double calcKelvin() { //calculates + returns kelvin temp
		ktemp = calcCelsius() + 273;
		return ktemp;
	}
}
