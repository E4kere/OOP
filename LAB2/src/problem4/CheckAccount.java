package problem4;

public class CheckAccount extends Account {

	private int transactionCount;
    private static final double TRANSACTION_FEE = 0.02;
    private static final int FREE_TRANSACTIONS = 5;

    public CheckAccount(int a) {
        super(a);
        transactionCount = 0;
    }

    public void deductFee() {
        int freeTransactions = Math.min(transactionCount, FREE_TRANSACTIONS);
        double fee = (transactionCount - freeTransactions) * TRANSACTION_FEE;
        withdraw(fee);
        transactionCount = 0; 
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    @Override
    public String toString() {
        return super.toString() + ", transaction count = " + transactionCount;
    }
}

