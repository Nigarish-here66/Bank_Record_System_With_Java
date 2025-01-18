/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

/**
 * The Client class represents a client in the bank record system.
 */
public class Client {
    private String name;  // Name of the client
    private final String username;  // Username of the client
    private String password;  // Password of the client

    /**
     * Constructs a new instance of the Client class with the specified name, username, and password.
     * @param name the name of the client
     * @param username the username of the client
     * @param password the password of the client
     */
    public Client(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the name of the client.
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the client.
     * @param name the name of the client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the username of the client.
     * @return the username of the client
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the client.
     * @return the password of the client
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the client.
     * @param password the password of the client
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns a string representation of the client.
     * @return a string representation of the client
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Username: " + username + ", Password: " + password;
    }
}
