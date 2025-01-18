package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The FileHandler class provides static methods for saving data to a file and loading data from a file.
 */
public class FileHandler {
    
    /**
     * Saves the given data to a file with the specified filename.
     * 
     * @param filename the name of the file to save the data to
     * @param data the data to be saved to the file
     */
    public static void saveToFile(String filename, String data) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(data);
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save data to file: " + filename);
        }
    }

    /**
     * Loads data from the file with the specified filename.
     * 
     * @param filename the name of the file to load data from
     * @return the data loaded from the file
     */
    public static String loadFromFile(String filename) {
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
            }
            System.out.println("Data loaded from file: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return data.toString();
    }
}
