package dataaccess;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * The SavingsAccount class represents a bank account with an additional interest rate.
 * It extends the BankAccount class and implements the necessary methods.
 */
public class SavingsAccount extends BankAccount {
    private final double interestRate;

    /**
     * Constructs a SavingsAccount object with the specified account details and interest rate.
     *
     * @param accountNumber     The account number.
     * @param accountHolderName The account holder's name.
     * @param balance           The account balance.
     * @param interestRate      The interest rate.
     */
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    /**
     * Calculates and deposits the interest amount based on the interest rate.
     * The interest is credited to the account balance.
     */
    public void calculateInterest() {
        double interestAmount = balance * interestRate / 100;
        deposit(interestAmount);
        System.out.println("Interest credited: " + interestAmount);
    }

    /**
     * Saves the account details, including the interest rate, to the specified file.
     *
     * @param filename The name of the file to save the account details to.
     */
    @Override
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(accountNumber);
            writer.println(accountHolderName);
            writer.println(balance);
            writer.println(interestRate);
            System.out.println("Account details saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save account details to file: " + filename);
        }
    }
}
