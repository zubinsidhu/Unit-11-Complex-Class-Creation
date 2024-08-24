import java.util.*;
public class PiggyBank {

	public static void main(String[] args) {
		ArrayList<Coin> piggyBank = new ArrayList<>();
		piggyBank.add(new Quarter());
		piggyBank.add(new Nickel());
		piggyBank.add(new Dime());
		piggyBank.add(new Quarter());
		piggyBank.add(new Quarter());
		
		double amount = 0;
		for (Coin e: piggyBank) {
			amount += e.getAmount();
		}
		System.out.printf("Piggy Bank holds $%.2f", amount);
	}

}

class Coin{
	private int cents;
	public Coin(int cents) {this.cents = cents;}
	public double getAmount() {return cents * 0.01;}
}

class Quarter extends Coin{
	public Quarter() {
		super(25);
	}
	public String toString() {
		return "Quarter";
	}
}

class Dime extends Coin{
	public Dime() {
		super(10);
	}
	public String toString() {
		return "Dime";
	}
}

class Nickel extends Coin{
	public Nickel() {
		super(5);
	}
	public String toString() {
		return "Nickel";
	}
}