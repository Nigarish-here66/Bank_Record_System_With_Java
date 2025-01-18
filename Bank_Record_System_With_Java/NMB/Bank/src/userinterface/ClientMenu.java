package userinterface;

import businesslogic.BankRecordSystemLogic;
import controller.BankRecordSystemController;

import java.util.Scanner;

public class ClientMenu {
    private static final BankRecordSystemLogic logic = new BankRecordSystemLogic();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t=====  Client Menu =====");
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t\t1. Registration");
            System.out.println("\t\t2. View Account");
            System.out.println("\t\t3. Contact Us");
            System.out.println("\t\t4. Provide Feedback");
            System.out.println("\t\t5. Exit");
            System.out.println("\n\t---------------------------------------------");
            System.out.print("\tEnter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n\t---------------------------------------------");

            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    viewAccount();
                    break;

                case 3:
                    contactUs();
                    break;

                case 4:
                    provideFeedback();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Perform client registration
    private static void register() {
        logic.registerClient();
    }

    // View client account information
    private static void viewAccount() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter client username: ");
        String username = scanner.nextLine();

        System.out.print("Enter client password: ");
        String password = scanner.nextLine();

        // Call the logic module to perform client account view
       // logic.performClientModule(username, password);
    }

    // Contact customer support
    private static void contactUs() {
        BankRecordSystemController.contactUs();
    }

    // Provide feedback
    private static void provideFeedback() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();

        // Process the feedback (save to database, send email, etc.)
        System.out.println("Thank you for your feedback!");
    }
}
