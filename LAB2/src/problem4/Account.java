package problem4;

public class Account {
	private double balance;
    private int acNumber;

    public Account(int a) {
        balance = 0.0;
        acNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return acNumber;
    }

    public void transfer(double amount, Account other) {
        withdraw(amount);
        other.deposit(amount);
    }

    public String toString() {
        return "Account number = " + acNumber + ", balance = " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
