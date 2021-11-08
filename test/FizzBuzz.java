package test;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println(fizzbuzz(11));
		loops(15);
	}

	private static String loops(int int1) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= 100) {
			if (int1 % 5 == 0 && int1 % 3 ==0) {
				return "FizzBuzz";
			} else if (int1 % 5 == 0) {
				return "Buzz";
			} else if (int1 % 3 == 0) {
				return "Fizz";
			} else {
				return Integer.toString(int1);
			}
		}
		}

	private static String fizzbuzz(int int1) {
		// TODO Auto-generated method stub
		if (int1 % 5 == 0 && int1 % 3 ==0) {
			return "FizzBuzz";
		} else if (int1 % 5 == 0) {
			return "Buzz";
		} else if (int1 % 3 == 0) {
			return "Fizz";
		} else {
			return Integer.toString(int1);
		}
	}

}
