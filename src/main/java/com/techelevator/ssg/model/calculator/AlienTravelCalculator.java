package com.techelevator.ssg.model.calculator;

public class AlienTravelCalculator {
	public static double alienCalc(String planet, String transportation) {
		transportations T = transportations.valueOf(transportation.replace(" ", "_").toUpperCase());
		double driveTime = planets.valueOf(planet.toUpperCase()).getDriveTime(T);
		return driveTime;

	}

	public enum planets {
		MERCURY(56974146), VENUS(25724767), MARS(48678219), JUPITER(390674710), SATURN(792248270), URANUS(
				1692662530), NEPTUNE(2703959960L);
		private long distance;

		private planets(long distance) {
			this.distance = distance;
		}

		public double getDriveTime(transportations transport) {
			return ((double)distance / transport.getMilesPerYear());
		}
	}

	public enum transportations {
		WALKING(26280), DRIVING(876000), BULLET_TRAIN(1753164), BOEING_747(4996517), CONCORDE(11833857);

		private int milesPerYear;

		private transportations(int milesPerYear) {
			this.milesPerYear = milesPerYear;
		}

		public int getMilesPerYear() {
			return milesPerYear;
		}
	}
}
