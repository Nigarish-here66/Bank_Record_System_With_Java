package userinterface;

import java.util.Scanner;

import businesslogic.BankRecordSystemLogic;

/**
 * The ManagerMenu class provides the menu and functionality for the Manager user role.
 */
public class ManagerMenu {
    private static final BankRecordSystemLogic logic = new BankRecordSystemLogic();

    /**
     * Displays the Manager menu and handles user input for Manager actions.
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t=====  Manager Menu =====");
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t\t1. Registration");
            System.out.println("\t\t2. Create Accounts");
            System.out.println("\t\t3. Input Records");
            System.out.println("\t\t4. Exit");
            System.out.println("\n\t---------------------------------------------");
            System.out.print("\tEnter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n\t---------------------------------------------");

            switch (choice) {
                case 1:
                    logic.registerManager();
                    break;

                case 2:
                    logic.createAccounts();
                    break;

                case 3:
                    inputRecords();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    /**
     * Displays the Input Records menu and handles user input for recording transactions.
     */
    public static void inputRecords() {
        Scanner scanner = new Scanner(System.in);
        int recordChoice;

        do {
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t=====  Input Records Menu =====");
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t\t1. Perform Deposit");
            System.out.println("\t\t2. Perform Debit");
            System.out.println("\t\t3. Calculate Interest");
            System.out.println("\t\t4. Exit");
            System.out.println("\n\t---------------------------------------------");
            System.out.print("\tEnter your choice: ");
            recordChoice = scanner.nextInt();
            System.out.println("\n\t---------------------------------------------");

            switch (recordChoice) {
                case 1:
                    logic.performDeposit();
                    break;

                case 2:
                    logic.performDebit();
                    break;

                case 3:
                    logic.performCalculateInterest();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (recordChoice != 4);
    }
}
