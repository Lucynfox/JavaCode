package test;

public class UniqueSum {
	public static void main(String[] args) {
		System.out.println(uniqueSum(3,3,3));
		loop();
	}

	private static int uniqueSum(int int1, int int2, int int3) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (int1 != int2 && int1 != int3) {
			sum+=int1;
		} if (int2 != int1 && int2 != int3) {
			sum+=int2;
		} if (int3 != int1 && int3 != int2) {
			sum+=int2;
		}
		return sum;
	}

}
