package dataaccess;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * The BankAccount class represents a bank account and provides methods to perform operations on the account.
 */
public class BankAccount implements DataAccessInterface {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    /**
     * Creates a new BankAccount object with the specified account number, account holder name, and balance.
     *
     * @param accountNumber     The account number.
     * @param accountHolderName The account holder's name.
     * @param balance           The account balance.
     */
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    @Override
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
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
            System.out.println("Account details saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save account details to file: " + filename);
        }
    }
}
