package fridaytask;

public class BankAccount {
	private int accountNumber;
	private int balance;
	private String accountName;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public static void main(String[] args) {
		BankAccount b= new BankAccount();
		b.setAccountName("Sanjay");
		b.setAccountNumber(45673);
		b.setBalance(15000);
		
		System.out.println("AccountName:"+b.getAccountName()+" "+"Balance:"+b.getBalance()+" "+"AccountNumber:"+b.getAccountNumber());
	}

}
