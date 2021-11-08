package test;

public class Arrays {
	public static void main(String[] args) {
		int[] ageArray = { 18, 26, 20, 100, 15}; // cannot increase the length of the array, you can in lists
				long[] ageArray2 = new long[6];
		String[] nameArray = {"john", "Emma", "Alex"};
		
		for (String name : nameArray){
			System.out.println(name);
		}
	}

}
