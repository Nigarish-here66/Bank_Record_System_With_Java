package dataaccess;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * The CurrentAccount class represents a current bank account and extends the BankAccount class.
 * It provides methods to perform operations specific to current accounts.
 */
public class CurrentAccount extends BankAccount {
    private final double overdraftLimit;

    /**
     * Creates a new CurrentAccount object with the specified account number, account holder name,
     * balance, and overdraft limit.
     *
     * @param accountNumber     The account number.
     * @param accountHolderName The account holder's name.
     * @param balance           The account balance.
     * @param overdraftLimit    The overdraft limit.
     */
    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void debit(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal amount exceeds overdraft limit!");
        } else {
            balance -= amount;
            System.out.println("Debit of " + amount + " successful.");
        }
    }

    @Override
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(accountNumber);
            writer.println(accountHolderName);
            writer.println(balance);
            writer.println(overdraftLimit);
            System.out.println("Account details saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save account details to file: " + filename);
        }
    }
}
