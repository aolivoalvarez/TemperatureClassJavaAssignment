/*Alexis Olivo-Alvarez

ITSE-2317 2801

23 October 2021

class that takes a fahrenheit temperature and calculates it into celcius and kelvin */

package TemperatureProgram;

import java.util.Scanner; //to get user input

public class TemperatureAssignment {

	public static void main(String[] args) {
		
		//declare temp variables
		double fahrenheit;
		double celcius;
		double kelvin;
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get fahrenheit value
		System.out.print("Please enter temperature in fahrenheit: ");
		fahrenheit = input.nextDouble();
		
		//create object of temperature class
		Temperature temp = new Temperature(fahrenheit);
		
		//getting celcius and kelvin values
		celcius = temp.calcCelsius();
		kelvin = temp.calcKelvin();
		
		//display values
		System.out.printf("%s%.2f%n", "Fahrenheit Temperature: ", fahrenheit);
		System.out.printf("%s%.2f%n", "Celcius Temperature: ", celcius);
		System.out.printf("%s%.2f%n", "Kelvin Temperature: ", kelvin);

	}

}
