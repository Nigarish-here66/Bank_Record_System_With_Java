/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

import dataaccess.BankAccount;
import java.util.ArrayList;
import java.util.List;

/**
 * The Admin class represents an administrator in the banking system.
 * It manages the registration, search, update, and deletion of clients and managers.
 */
class Admin {
    private final List<Client> clients;  // List to store registered clients
    private final List<Manager> managers;  // List to store registered managers

    /**
     * Constructs a new instance of the Admin class.
     * Initializes the lists of clients and managers.
     */
    public Admin() {
        clients = new ArrayList<>();
        managers = new ArrayList<>();
    }

    /**
     * Registers a new manager with the specified name, username, and password.
     * 
     * @param name the name of the manager
     * @param username the username of the manager
     * @param password the password of the manager
     */
    public void registerManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        managers.add(manager);
        System.out.println("Manager registered successfully.");
    }

    /**
     * Registers a new client with the specified name, username, and password.
     * 
     * @param name the name of the client
     * @param username the username of the client
     * @param password the password of the client
     */
    public void registerClient(String name, String username, String password) {
        Client client = new Client(name, username, password);
        clients.add(client);
        System.out.println("Client registered successfully.");
    }

    /**
     * Searches for a client with the specified username and displays their details.
     * 
     * @param username the username of the client to search for
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
     * Updates the details (name and password) of a client with the specified username.
     * 
     * @param username the username of the client to update
     * @param newName the new name for the client
     * @param newPassword the new password for the client
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
     * Deletes a client with the specified username.
     * 
     * @param username the username of the client to delete
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
     * Displays all records of clients and managers.
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

    /**
     * Creates a new bank account for a client.
     * 
     * @param account the bank account to be created
     */
    void createAccount(BankAccount account) {
       
    }
}
