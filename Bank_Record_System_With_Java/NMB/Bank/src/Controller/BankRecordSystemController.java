package controller;

import java.util.Scanner;
import userinterface.AdminMenu;
import userinterface.ClientMenu;
import userinterface.ManagerMenu;

public class BankRecordSystemController {

    // Method for performing the admin module
    public static void performAdminModule() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for admin username
        System.out.print("\tEnter admin username: ");
        String username = scanner.nextLine();
        
        System.out.println("");

        // Prompt for admin password
        System.out.print("\tEnter admin password: ");
        String password = scanner.nextLine();

        System.out.println("");
        
        // Check if admin credentials are valid
        if (isValidAdminCredentials(username, password)) {
            System.out.println("\tAdmin login successful!");
            System.out.println("\tPerforming admin tasks...");
        } else {
            System.out.println("\tInvalid admin credentials!");
        }
        
        // Display admin menu
        AdminMenu.menu();
    }

    // Method for performing the manager module
    public static void performManagerModule() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for manager username
        System.out.print("\tEnter manager username: ");
        String username = scanner.nextLine();

        System.out.println("");
        
        // Prompt for manager password
        System.out.print("\tEnter manager password: ");
        
        System.out.println("");
        
        String password = scanner.nextLine();
        
        // Check if manager credentials are valid
        if (isValidManagerCredentials(username, password)) {
            System.out.println("\tManager login successful!");
            System.out.println("\tPerforming manager tasks...");
        } else {
            System.out.println("\tInvalid manager credentials!");
        }
        
        // Display manager menu
        ManagerMenu.menu();
    }

    // Method for performing the client module
    public static void performClientModule() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for client username
        System.out.print("\tEnter client username: ");
        String username = scanner.nextLine();

        System.out.println("");
        
        // Prompt for client password
        System.out.print("\tEnter client password: ");
        String password = scanner.nextLine();

        System.out.println("");

        // Check if client credentials are valid
        if (isValidClientCredentials(username, password)) {
            System.out.println("\tClient login successful!");
            System.out.println("\tPerforming client tasks...");
        } else {
            System.out.println("\tInvalid client credentials!");
        }
        
        // Display client menu
        ClientMenu.menu();
    }

    // Method for performing user registration
    public static void performRegistration() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.print("\tEnter your name: ");
        String name = scanner.nextLine();

        System.out.println("");
        
        // Prompt for email address
        System.out.print("\tEnter your email address: ");

        System.out.println("");
        
        // Prompt for password
        System.out.print("\tEnter a password: ");

        System.out.println("");
        
        System.out.println("\tRegistration successful! Welcome, " + name + "!");
    }

    // Method for displaying information about the application
    public static void aboutUs() {
        System.out.println("\tMy Application Bank Record System");
        System.out.println("\tDeveloped by:");
        System.out.println("\t(1) Nagarish Fateh - 44815");
        System.out.println("\t(2) Manahil Habib - 47876");
        System.out.println("\tCopyright 2023");
    }

    // Method for contacting the support team
    public static void contactUs() {
        Scanner scanner = new java.util.Scanner(System.in);

        // Prompt for name
        System.out.println("\tPlease enter your name:");
        String name = scanner.nextLine();

        System.out.println("");
        
        // Prompt for email address
        System.out.println("\tPlease enter your email address:");
        String email = scanner.nextLine();

        System.out.println("");
        
        // Prompt for message
        System.out.println("\tPlease enter your message:");
        String message = scanner.nextLine();

        System.out.println("");
        
        System.out.println("\tThank you for your message, " + name + "!");
        System.out.println("\tWe will get back to you at " + email + " as soon as possible.");
        System.out.println("\tYour message: " + message);
    }

    // Method to validate admin credentials
    public static boolean isValidAdminCredentials(String username, String password) {
        return username.equals("Nigarish") && password.equals("44815");
    }

    // Method to validate client credentials
    private static boolean isValidClientCredentials(String username, String password) {
        return username.equals("client") && password.equals("client123");
    }

    // Method to validate manager credentials
    private static boolean isValidManagerCredentials(String username, String password) {
        return username.equals("Manahil") && password.equals("47876");
    }
}
