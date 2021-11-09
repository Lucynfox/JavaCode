package test;

public class Banker {
	
	
	public int nonStaticMethod(int number1, int number2) {
		System.out.println("Non static Method");
		return number1 + number2;
	}
	
	public static int staticMethod(int num1, int num2) {
		System.out.println("static Method");
		return num1 + num2;
	}

}
