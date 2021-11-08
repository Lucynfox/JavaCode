package test;

public class ArrayExercises {
	public static void main(String[] args) {
		int[] numbs = {12,22,23,11,56,99,34, 88, 54, 44};
//		for (int numb : numbs) {
//			System.out.println(numb);
//		}
		
		int[] newnumbs = new int[10];
		
		for (int i=0;i<newnumbs.length; i++) {
			newnumbs[i] = i+1;
			System.out.println(newnumbs[i]);
		}
//		for (int numb : newnumbs) {
//			System.out.println(numb);
//		}
		
		for (int i=0;i<newnumbs.length; i++) {
			newnumbs[i] = newnumbs[i]*10;
			System.out.println(newnumbs[i]);
		}
	}

}
