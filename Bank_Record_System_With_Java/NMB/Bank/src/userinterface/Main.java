/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

/**
 * The Main class serves as the entry point for the Bank Record System application.
 * It initializes the user interface and starts the application.
 */
public class Main {
    /**
     * The main method is the entry point for the Bank Record System application.
     * It creates an instance of BankRecordSystemUI and starts the application.
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        BankRecordSystemUI ui = new BankRecordSystemUI();
        ui.start();
    }
}
