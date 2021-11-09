package test;

public class BankAccount {
	private int bankBalance;
	private String accountHolderName;
	private int phoneNumber;
	
	public BankAccount(int bankBalance, String accountHolderName, int phoneNumber) {
        this.bankBalance = bankBalance;
        this.accountHolderName = accountHolderName;
        this.phoneNumber = phoneNumber;
    }

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
