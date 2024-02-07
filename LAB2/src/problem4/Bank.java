package problem4;

import java.util.*;

public class Bank {
	private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckAccount) {
                ((CheckAccount) account).deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
