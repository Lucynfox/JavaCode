package test;

public class Package_rice {
	public static void main(String[] args) {
		riceBag(4);
	}

	private static int riceBag(int goal_amount) {
		// TODO Auto-generated method stub
		int goalAmountRemaining = goal_amount;
		int amountOf5s = (int)(goalAmountRemaining / 5);
		goalAmountRemaining -= amountOf5s * 5;
		int amountOf1s = (int)(goalAmountRemaining / 1);
		goalAmountRemaining -= 1 * 1;
		System.out.println("No of 5kg bags: " + amountOf5s);
		System.out.println("No of 1kg bags: " + amountOf1s);
		if (goalAmountRemaining != 0) {
			return -1;
		}else {
			return amountOf1s;
		}
	}

}
