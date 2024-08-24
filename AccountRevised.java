import java.util.ArrayList;
import java.util.Date;
public class AccountRevised {

	public static void main(String[] args) {
		Account.setAnnualInterestRate(1.5);
		Account a1 = new Account("Zebra G.", 4419, 5000);
		a1.deposit(400);
		a1.withdraw(40);
		a1.deposit(60);
		a1.deposit(90);
		a1.withdraw(150);
		a1.withdraw(10);
		a1.deposit(300);
		a1.withdraw(200);
		System.out.println(a1);
		for (Transaction e: a1.getTransactions()) {
			System.out.println(e);
		}
	}

}

class Account {
	private String name;
	private int id;
	private double balance;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account() { dateCreated = new Date(); }
	public Account(int i, double b) {
		dateCreated = new Date();
		id = i;
		balance = b;
	}
	public Account(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() { return id; }
	public double getBalance() { return balance; }
	public static double getAnnualInterestRate() { return annualInterestRate; }
	public Date getDateCreated() { return dateCreated; }
	public double getMonthlyInterestRate() { return (balance * (annualInterestRate / 12)); }
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setId(int newId) { id = newId; }
	public void setBalance(double newBalance) { balance = newBalance; }
	public static void setAnnualInterestRate(double newAnnualInterestRate) { annualInterestRate = newAnnualInterestRate; }
	
	public void withdraw(double amount) { 
		balance -= amount;
		Transaction w = new Transaction('W', amount, balance, "Withdrawl");
		transactions.add(w);
	}
	public void deposit(double amount) { 
		balance += amount;
		Transaction d = new Transaction('D', amount, balance, "Deposit");
		transactions.add(d);
	}
	
	public String toString() {
		return "Name: " + name + " ID: " + id + " Interest Rate: " + annualInterestRate + " Current Balance: $" + balance;
	}
}

class Transaction{
	private Date date = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	public Date getDate() {return date;}
	public char getType() {return type;}
	public double getAmount() {return amount;}
	public double getBalance() {return balance;}
	public String getDescription() {return description;}
	public String toString() {
		return "Date: " + date + " Type: " + type + " Amount: " + amount + " Balance: " + balance + " Description " + description;
	}
}