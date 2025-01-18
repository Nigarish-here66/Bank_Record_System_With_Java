package businesslogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The FileHandler class provides methods for saving data to and loading data from files.
 */
class FileHandler {
    /**
     * Saves the specified data to the given file.
     *
     * @param filename The name of the file to save the data to.
     * @param data     The data to be saved to the file.
     */
    static void saveToFile(String filename, String data) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(data);
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save data to file: " + filename);
        }
    }

    /**
     * Loads data from the specified file.
     *
     * @param filename The name of the file to load the data from.
     * @return The data loaded from the file as a string.
     */
    static String loadFromFile(String filename) {
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
