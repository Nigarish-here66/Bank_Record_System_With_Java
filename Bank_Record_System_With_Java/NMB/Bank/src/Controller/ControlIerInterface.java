package controller;

/**
 * The ControlIerInterface interface defines a contract for file handling operations.
 * It provides methods for saving data to a file and loading data from a file.
 */
public interface ControlIerInterface {
    
    /**
     * The FileHandler interface defines methods for file handling operations.
     */
    public interface FileHandler {
        
        /**
         * Saves the given data to a file with the specified filename.
         * 
         * @param filename the name of the file to save the data to
         * @param data the data to be saved to the file
         */
        void saveToFile(String filename, String data);
        
        /**
         * Loads data from the file with the specified filename.
         * 
         * @param filename the name of the file to load data from
         * @return the data loaded from the file
         */
        String loadFromFile(String filename);
    }
}
