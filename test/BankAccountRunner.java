package test;

public class BankAccountRunner {
	public static void main(String[] args) {
		BankAccount lucy = new BankAccount(121, "Lucy", 072);
		
		System.out.println(lucy.getBankBalance());
		
		int num = Banker.staticMethod(5,4);
		System.out.println(num);
		
		
		
		
	}
	
//		BankAccount.getBankBalance();
		
		
	

}
