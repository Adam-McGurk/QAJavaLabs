package lab08;

public class Account {
	
	private int id;
	private String owner;
	private double balance;
	
	public Account (int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public void deposit(double amount) {
		
		if(amount <= 0.0) {
			System.out.println("You cannot add negative or no money into your account");
		
		}else {
			
			balance += amount;
		}
		
		
	}
	
	public void withdraw(double amount) {
		
		if(amount > balance) {
			System.out.println("You do not have enough money in account to withdraw " + amount);
		}else {
			
			balance -= amount;
		}
	}
	
	public void getDetails() {
		System.out.printf("Account ID: " + id + " Account owner: " + owner + " Account balance:£ " + "%.2f", balance);
	}
	
	public void addInterest() {
		
		balance = balance * 2.5;
	}

}
