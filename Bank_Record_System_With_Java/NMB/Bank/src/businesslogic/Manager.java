package businesslogic;

/**
 * The Manager class represents a bank manager.
 */
public class Manager {
    private final String name;
    private final String username;
    private final String password;

    /**
     * Constructs a Manager object with the specified name, username, and password.
     *
     * @param name     The name of the manager.
     * @param username The username of the manager.
     * @param password The password of the manager.
     */
    public Manager(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * Retrieves the name of the manager.
     *
     * @return The name of the manager.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the username of the manager.
     *
     * @return The username of the manager.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Retrieves the password of the manager.
     *
     * @return The password of the manager.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns a string representation of the Manager object.
     *
     * @return A string representation of the Manager object.
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Username: " + username;
    }
}
