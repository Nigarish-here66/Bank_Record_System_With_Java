package dataaccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The FileHandler class provides utility methods for loading and saving data to files.
 */
public class FileHandler {
    
    /**
     * Loads a BankAccount object from the specified file.
     *
     * @param filename The name of the file to load the account details from.
     * @return The loaded BankAccount object.
     */
    public static BankAccount loadFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String accountNumber = scanner.nextLine();
            String accountHolderName = scanner.nextLine();
            double balance = Double.parseDouble(scanner.nextLine());
            System.out.println("Account details loaded from file: " + filename);
            return new BankAccount(accountNumber, accountHolderName, balance);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return null;
    }

    /**
     * Saves the specified data to a file with the specified filename.
     *
     * @param filename The name of the file to save the data to.
     * @param data The data to be saved.
     */
    public static void saveToFile(String filename, String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Placeholder for implementation
    }
}
