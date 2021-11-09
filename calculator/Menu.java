package com.qa.calculator;

import java.util.Scanner;

public class Menu {
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;
		int num1;
		int num2;
		int result;
		int userChoice;

	public void start() {
		System.out.println("Welcome to the calculator");

		while (isRunning) {
			System.out.println("Please select one of the following");
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Division");
			System.out.println("0: Exit");

			userChoice = scan.nextInt();

			switch (userChoice) {
			case 1:
				System.out.println("Addition");
				System.out.println("Enter first number");
				num1 = scan.nextInt();
				System.out.println("Enter second number");
				num2 = scan.nextInt();
				result = CalculatorScanner.addTwoNumbs(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				System.out.println("Subtraction");
				System.out.println("Enter first number");
				num1 = scan.nextInt();
				System.out.println("Enter second number");
				num2 = scan.nextInt();
				result = CalculatorScanner.subtraction(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 3:
				System.out.println("Multiplication");
				System.out.println("Enter first number");
				num1 = scan.nextInt();
				System.out.println("Enter second number");
				num2 = scan.nextInt();
				result = CalculatorScanner.multiplication(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 4:
				System.out.println("Division");
				System.out.println("Enter first number");
				double number1 = scan.nextInt();
				System.out.println("Enter second number");
				double number2 = scan.nextInt();
				double output = CalculatorScanner.division(num1, num2);
				System.out.println("Result: " + output);
				break;
			case 0:
				isRunning = false;
				break;
			}
		}
	}

}
