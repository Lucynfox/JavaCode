package test;

public class EnhancedLoops {
	public static void main(String[] args) {
		String[] stringList = {"Lucy", "John", "Jack"};
//		for(String name : stringList) {
//			System.out.println(name);
//		}
		int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int num : arrayOfInts) {
			System.out.println(num * num);
		}
		System.out.println(isEven(5));
		
		for (int num : arrayOfInts) {
			if(isEven(num)) {
				System.out.println(Math.pow(num, 3));
			} else {
				System.out.println(num * num);
			}}
		
	}

	private static boolean isEven(int num) {
		// TODO Auto-generated method stub
		if (num%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
