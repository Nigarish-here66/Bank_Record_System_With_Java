package businesslogic;

import dataaccess.BankAccount;
import dataaccess.SavingsAccount;
import dataaccess.FileHandler;
import java.util.Scanner;

/**
 * The BankRecordSystemLogic class implements the LogicInterface and represents the logic
 * for performing various banking operations in the bank record system.
 */
public class BankRecordSystemLogic implements LogicInterface {
    private final Scanner scanner;  // Scanner for user input
    private final Admin admin;  // Admin instance for managing clients and managers

    /**
     * Constructs a new instance of the BankRecordSystemLogic class.
     * Initializes the scanner and admin objects.
     */
    public BankRecordSystemLogic() {
        scanner = new Scanner(System.in);
        admin = new Admin();
    }

    /**
     * Performs a deposit operation by taking input from the user and updating the account balance.
     */
    public void performDeposit() {
        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter the deposit amount: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character

        BankAccount account = new BankAccount(accountNumber, accountHolderName, 0);
        account.deposit(depositAmount);

        // Save deposit details to a file
        String data = "Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName + "\nDeposit Amount: " + depositAmount;
        FileHandler.saveToFile("deposit.txt", data);
    }

    /**
     * Performs a debit operation by taking input from the user and updating the account balance.
     */
    public void performDebit() {
        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter the debit amount: ");
        double debitAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character

        BankAccount account = new BankAccount(accountNumber, accountHolderName, 0);
        account.debit(debitAmount);

        // Save debit details to a file
        String data = "Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName + "\nDebit Amount: " + debitAmount;
        FileHandler.saveToFile("debit.txt", data);
    }

    /**
     * Performs an interest calculation for a savings account by taking input from the user.
     */
    public void performCalculateInterest() {
        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter the account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter the balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline character

        SavingsAccount account = new SavingsAccount(accountNumber, accountHolderName, balance, interestRate);
        account.calculateInterest();

        // Save account details to a file
        String data = "Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName + "\nBalance: " + balance + "\nInterest Rate: " + interestRate;
        FileHandler.saveToFile("account.txt", data);
    }

    /**
     * Registers a manager by taking input from the user and calling the appropriate admin method.
     */
    public void registerManager() {
        System.out.print("Enter manager name: ");
        String name = scanner.nextLine();

        System.out.print("Enter manager username: ");
        String username = scanner.nextLine();

        System.out.print("Enter manager password: ");
        String password = scanner.nextLine();

        admin.registerManager(name, username, password);
    }

    /**
     * Registers a client by taking input from the user and calling the appropriate admin method.
     */
    public void registerClient() {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();

        System.out.print("Enter client username: ");
        String username = scanner.nextLine();

        System.out.print("Enter client password: ");
        String password = scanner.nextLine();

        admin.registerClient(name, username, password);
    }

    /**
     * Creates multiple accounts by taking input from the user and calling the appropriate admin method.
     */
    public void createAccounts() {
        System.out.print("Enter the number of accounts to create: ");
        int numAccounts = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        for (int i = 0; i < numAccounts; i++) {
            System.out.print("Enter the account number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter the account holder name: ");
            String accountHolderName = scanner.nextLine();

            System.out.print("Enter the balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume the remaining newline character

            BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
            admin.createAccount(account);
        }
    }
}
