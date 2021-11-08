package test;

public class BottlesOfBeer {
	public static void main(String[] args) {
		bottlesOfBeer();
	}

	private static void bottlesOfBeer() {
		// TODO Auto-generated method stub
		int bottles = 9;
		while(bottles >1) {
			int bottles_1 = bottles-1;
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + bottles_1 + " bottles of beer on the wall.");
			bottles--;
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}

}
