package test;

import java.lang.Math;

public class results {
	public static void main(String[] args) {
		displayResults(30, 31, 32);
		overallPercentage(140, 40, 140);

	}

	private static void overallPercentage(double physicsScore, double chemistryScore, double biologyScore) {
		// TODO Auto-generated method stub
		double totalMarks = physicsScore + chemistryScore + biologyScore;
		double percentage = Math.round((totalMarks * 100) / 450); 
		String message = "Overall percentage: " + percentage + "%";
		System.out.println(message);
		
		double physicsPercent = (physicsScore/150) * 100;
		double chemistryPercent = (chemistryScore/150) * 100;
		double biologyPercent = (biologyScore/150) * 100;
		int counter = 0;
		
		if (physicsPercent < 60) {
			counter++;	
		} if ( chemistryPercent < 60) {
			counter++;
		}if ( biologyPercent < 60) {
				counter++;
		} if (counter > 0) {
			System.out.println("You have failed " + counter + " subjects!");
		}
	}

	private static void displayResults(int physicsScore, int chemistryScore, int biologyScore) {
		// TODO Auto-generated method stub
		System.out.println("PHYSICS: " + physicsScore + "/150 ");
		System.out.println("CHEMISTRY: " + chemistryScore + "/150 ");
		System.out.println("BIOLOGY: " + biologyScore + "/150 ");
		int totalScore = physicsScore + chemistryScore + biologyScore;
		System.out.println("Total Score: " + totalScore + "/450");

	}
}