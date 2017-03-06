package com.techelevator.ssg.model.calculator;


public class AlienAgeCalculator {

	public static double alienCalc(String planet, int age) {
		double planetsAge = planets.valueOf(planet).AgeOnPlanet(age);
		return planetsAge;

	}

	public enum planets {
		MERCURY(87.96), VENUS(224.68), MARS(686.98), JUPITER(4332.71), SATURN(10759.83), URANUS(30707.41), NEPTUNE(60198.50);
		private double multipler;

		private planets(double multipler) {
			this.multipler = multipler;
		}

		public double AgeOnPlanet(int earthAge) {
			return ((earthAge * 365.26)/multipler);
		}
	}
}
