package test;

public class Loops {
	public static void main(String[] args) {
//		whileLoop(-5);
//		forLoop();
		nestedForLoop();
	}
	
	private static void nestedForLoop() {
		// TODO Auto-generated method stub
		for (int i =1; i <=10; i++) {
			System.out.println("outer loop");
			System.out.println(i);
			for (int j =1; j <=10; j++) {
				System.out.println("inner loop");
				System.out.println(j);
	}}}

	private static void forLoop() {
		// TODO Auto-generated method stub
		for (int i =1; i <=10; i++) {
			System.out.println(i);
	}}

	private static void whileLoop(int int1) {
		// TODO Auto-generated method stub
		while (int1 <= 10) {
			System.out.println(int1);
			int1++;
		}
	}

}
