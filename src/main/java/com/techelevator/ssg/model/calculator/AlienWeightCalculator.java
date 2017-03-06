package com.techelevator.ssg.model.calculator;

public class AlienWeightCalculator {

	public static double alienCalc(String planet, double weight) {
		double planetsWeight = planets.valueOf(planet).weigghtOnPlanet(weight);
		return planetsWeight;

	}

	public enum planets {
		MERCURY(0.37), VENUS(0.90), MARS(0.38), JUPITER(2.65), SATURN(1.13), URANUS(1.09), NEPTUNE(1.43);
		private double multipler;

		private planets(double multipler) {
			this.multipler = multipler;
		}

		public double weigghtOnPlanet(double earthWeight) {
			return (earthWeight * multipler);
		}
	}
}
