package userinterface;

import businesslogic.Client;
import businesslogic.Manager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMenu {
    private static final Admin admin = new Admin();

    /**
     * Displays the Admin Menu and handles user input.
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t=====  Admin Menu =====");
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t\t1. Search Client Details");
            System.out.println("\t\t2. Update Client Details");
            System.out.println("\t\t3. Delete Client Details");
            System.out.println("\t\t4. Register Manager");
            System.out.println("\t\t5. Register Client");
            System.out.println("\t\t6. Display Records");
            System.out.println("\t\t7. Exit");
            System.out.println("\n\t---------------------------------------------");
            System.out.print("\tEnter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n\t---------------------------------------------");

            switch (choice) {
                case 1 -> {
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter client username: ");
                    String username = scanner.nextLine();
                    admin.searchClient(username);
                }

                case 2 -> {
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter client username: ");
                    String updateUsername = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    admin.updateClient(updateUsername, newName, newPassword);
                }

                case 3 -> {
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter client username: ");
                    String deleteUsername = scanner.nextLine();
                    admin.deleteClient(deleteUsername);
                }

                case 4 -> {
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter manager name: ");
                    String managerName = scanner.nextLine();
                    System.out.print("Enter manager username: ");
                    String managerUsername = scanner.nextLine();
                    System.out.print("Enter manager password: ");
                    String managerPassword = scanner.nextLine();
                    admin.registerManager(managerName, managerUsername, managerPassword);
                }

                case 5 -> {
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter client name: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Enter client username: ");
                    String clientUsername = scanner.nextLine();
                    System.out.print("Enter client password: ");
                    String clientPassword = scanner.nextLine();
                    admin.registerClient(clientName, clientUsername, clientPassword);
                }

                case 6 -> admin.displayAllRecords();

                case 7 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }

}

/**
 * The Admin class represents an administrator of the system.
 * It manages the registration and management of clients and managers.
 */
class Admin {
    private final List<Client> clients;
    private final List<Manager> managers;

    /**
     * Constructs an Admin object with empty client and manager lists.
     */
    public Admin() {
        clients = new ArrayList<>();
        managers = new ArrayList<>();
    }

    /**
     * Registers a new manager with the specified name, username, and password.
     *
     * @param name     The name of the manager.
     * @param username The username of the manager.
     * @param password The password of the manager.
     */
    public void registerManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        managers.add(manager);
        System.out.println("Manager registered successfully.");
    }

    /**
     * Registers a new client with the specified name, username, and password.
     *
     * @param name     The name of the client.
     * @param username The username of the client.
     * @param password The password of the client.
     */
    public void registerClient(String name, String username, String password) {
        Client client = new Client(name, username, password);
        clients.add(client);
        System.out.println("Client registered successfully.");
    }

    /**
     * Searches for a client with the specified username and displays their details if found.
     *
     * @param username The username of the client to search for.
     */
    public void searchClient(String username) {
        for (Client client : clients) {
            if (client.getUsername().equals(username)) {
                System.out.println("Client found:");
                System.out.println(client);
                return;
            }
        }
        System.out.println("Client not found.");
    }

    /**
     * Updates the details (name and password) of the client with the specified username.
     *
     * @param username    The username of the client to update.
     * @param newName     The new name for the client.
     * @param newPassword The new password for the client.
     */
    public void updateClient(String username, String newName, String newPassword) {
        for (Client client : clients) {
            if (client.getUsername().equals(username)) {
                client.setName(newName);
                client.setPassword(newPassword);
                System.out.println("Client details updated successfully.");
                return;
            }
        }
        System.out.println("Client not found.");
    }

    /**
     * Deletes the client with the specified username.
     *
     * @param username The username of the client to delete.
     */
    public void deleteClient(String username) {
        Client clientToRemove = null;
        for (Client client : clients) {
            if (client.getUsername().equals(username)) {
                clientToRemove = client;
                break;
            }
        }
        if (clientToRemove != null) {
            clients.remove(clientToRemove);
            System.out.println("Client deleted successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    /**
     * Displays the records of all clients and managers.
     */
    public void displayAllRecords() {
        System.out.println("Clients:");
        for (Client client : clients) {
            System.out.println(client);
        }

        System.out.println("\nManagers:");
        for (Manager manager : managers) {
            System.out.println(manager);
        }
    }
}
