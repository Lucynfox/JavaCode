package test;

public class Coins {
	public static void main(String[] args) {
//		coins(19, 20.44);
		coinsWithLoops(14,20);
	}

	private static void coinsWithLoops(double cost,double customerCashGiven) {
		// TODO Auto-generated method stub
		double changeOwed = customerCashGiven - cost;
		
		System.out.println(changeOwed);
		System.out.println("Change Due");
		System.out.println("Amount of £10 notes: " + amountOf10s);
		System.out.println("Amount of £5 notes: " + amountOf5s);
		System.out.println("Amount of £1 coins: " + amountOfPounds);
		System.out.println("Amount of 50p's: " + amountOf50ps);
		System.out.println("Amount of 20p's: " + amountOf20ps);
		System.out.println("Amount of 2p's: " + amountOf2ps);
		System.out.println("Amount of 1p's: " + amountOf1ps);
	}

	private static void coins(double cost,double customerCashGiven) {
		// TODO Auto-generated method stub
		double changeOwed = customerCashGiven - cost;
		int amountOf10s = (int)(changeOwed / 10);
		changeOwed = changeOwed - amountOf10s * 10;
		int amountOf5s = ((int)changeOwed) / 5;
		changeOwed = changeOwed - amountOf5s * 5;
		int amountOf20ps = (int)(changeOwed / 0.2);
		changeOwed = changeOwed - amountOf20ps * 0.2;
		int amountOf2ps = (int)(changeOwed / 0.02);
		changeOwed = changeOwed - amountOf2ps * 0.02;
		System.out.println("Change Due");
		System.out.println("Amount of £10 notes: " + amountOf10s);
		System.out.println("Amount of £5 notes: " + amountOf5s);
		System.out.println("Amount of 20p's: " + amountOf20ps);
		System.out.println("Amount of 2p's: " + amountOf2ps);
	}
}
