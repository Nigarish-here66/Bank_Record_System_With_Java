package userinterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public record FileHandler() {
    // Save data to a file
    static void saveToFile(String filename, String data) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(data);
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save data to file: " + filename);
        }
    }

    // Load data from a file
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
