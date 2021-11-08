package test;

public class conditionals {
	public static void main(String[] args) {
		int number = 19;
		
		if (number <=20) {
			System.out.println("Number is less than or equal to 20");
		} else if (number<40) {
			System.out.println("Number is between 20 and 40");
		} else {
		System.out.println("Number is greater thna or equal to 40");
	}
		switchCase();
	}

	private static void switchCase() {
		// TODO Auto-generated method stub
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("case1");
			break;
		case 2:
			System.out.println("case2");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
	
}
