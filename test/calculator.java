package test;

public class calculator {
	public static void main(String[] args) {
		addTwoNumbs(1, 2);
		multiplication(2, 2);
		subtraction(10, 2);
		division(11, 2);
	}

	private static double division(double int1, double int2) {
		// TODO Auto-generated method stub
		System.out.println(int1 / int2);
		if (int1 < int2) {
			return int1 / int2;
		}
		System.out.println("Division cannot be performed");
		return -1;

	}

	private static int subtraction(int int1, int int2) {
		// TODO Auto-generated method stub
		return int1 - int2;

	}

	private static int multiplication(int int1, int int2) {
		// TODO Auto-generated method stub
		return int1 * int2;
	}

	private static int addTwoNumbs(int int1, int int2) {
		// TODO Auto-generated method stub
		int sum = int1 + int2;
		System.out.println(sum);
		return sum;
	}

}
