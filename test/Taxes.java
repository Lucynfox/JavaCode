package test;

public class Taxes {
	public static void main(String[] args) {
		int percent = taxrate(30000);
		System.out.println("Your taxrate is: " + percent +"%");
		double taxOwed = taxOwed(50000);
		System.out.println("You owe: £" + taxOwed);
	}

	private static double taxOwed(int salary) {
		// TODO Auto-generated method stub
		int taxrate = taxrate(salary);
		double percent = (taxrate/100.0);
		double taxOwed = salary * percent;
		return taxOwed;
	}

	private static int taxrate(int salary) {
		// TODO Auto-generated method stub
		if (salary <= 14999) {
			return 0;
		} else if (salary <= 19999) {
			return 10;
		} else if (salary <= 29999) {
			return 15;
		} else if (salary <= 44999) {
			return 20;
		} else {
			return 25;
		}
	}

}
