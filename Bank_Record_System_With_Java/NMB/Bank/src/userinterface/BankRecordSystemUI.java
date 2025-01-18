package userinterface;

import java.util.Scanner;

public class BankRecordSystemUI implements UserIntefaceInterface {

    @Override
    public void start() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t=====  Welcome To Bank Record System Menu =====");
            System.out.println("\n\t---------------------------------------------");
            System.out.println("\t\t1. Admin");
            System.out.println("\t\t2. Manager");
            System.out.println("\t\t3. Client");
            System.out.println("\t\t4. Exit");
            System.out.println("\n\t---------------------------------------------");
            System.out.print("\tEnter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n\t---------------------------------------------");

            switch (choice) {
                case 1 -> AdminMenu.menu();

                case 2 -> ManagerMenu.menu();

                case 3 -> ClientMenu.menu();

                case 4 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
