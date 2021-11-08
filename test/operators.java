package test;

public class operators {
	public static void main(String[] args) {
		int number = 3;
		
		System.out.println(number*3);
		
		int int2 = 5;
		int2 += 1;
		System.out.println(int2);
		
		
		
		boolean boolie = true;
		System.out.println(!boolie);
		
		System.out.println(boolie(4,1));
	}

	private static boolean boolie(int int1, int int2) {
		// TODO Auto-generated method stub
		int sum = int1 + int2;
		System.out.println(sum);
		if (sum == 5) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
