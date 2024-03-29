package problem4;

public class SavingsAccount extends Account {

	private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", interest rate = " + interestRate;
    }
}

