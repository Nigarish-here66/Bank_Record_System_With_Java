package dataaccess;

/**
 * The DataAccessInterface defines the methods that need to be implemented by classes
 * that provide data access functionality.
 */
public interface DataAccessInterface {
    
    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to be deposited.
     */
    void deposit(double amount);
    
    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to be debited.
     */
    void debit(double amount);
    
    /**
     * Saves the account details to a file with the specified filename.
     *
     * @param filename The name of the file to save the account details to.
     */
    void saveToFile(String filename);
}
