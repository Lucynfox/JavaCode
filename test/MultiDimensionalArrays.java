package test;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][] ageArray = {{25,30,31},{56,67,89},{8,1,2}};
		String[][] nameArray = new String[3][2];
		int[][][] ageArray3 = new int[3][5][23];
		
		for (int[] array : ageArray) {
			for (int value : array) {
				System.out.println(value);
			}
		}
	}

}
