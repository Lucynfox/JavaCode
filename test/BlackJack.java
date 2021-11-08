package test;

public class BlackJack {
	public static void main(String[] args) {
		System.out.println(blackjack(7,25));
	}

	private static int blackjack(int int1, int int2) {
		// TODO Auto-generated method stub
		if (int1 > 21 && int2 > 21) {
			System.out.println("Both players are bust");
			return 0;
		} else if (int1 == int2){
			System.out.println("draw!");
			return int1;
		}
		if ((int1 > int2 && int1 <= 21) || (int2 > 21 && int1 <= 21)) {
			return int1;
		} else {
			return int2;
		}
	}

}
