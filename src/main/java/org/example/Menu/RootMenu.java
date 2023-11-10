package org.example.Menu;
import java.io.IOException;
import java.util.Scanner;
import org.example.Data.DataManagement;

public class RootMenu {
    public void run() throws IOException {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome! Choose a menu option:");
            System.out.println("1. User management");
            System.out.println("2. Student management");
            System.out.println("Q to quit");
            String choice = scanner.nextLine();
            String nextStep = "";
            switch (choice) {
                case "1":
                    UserMenu userMenu = new UserMenu();
                    userMenu.run();
                    break;
                case "2":
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.run();
                    break;
                case "Q":
                    exitLoop = true;
                    break;
                case "q":
                    exitLoop = true;
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        }
    }
}
