package org.example.Menu.UserSubMenu;
import org.example.UserManagement.*;

import java.util.Scanner;

public class LoginMenu {
    public void run() {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter username:");
            String user = scanner.nextLine();
            System.out.println("Enter password:");
            String pw = scanner.nextLine();
            if (User.login(user, pw)) {
                System.out.println("Welcome. What would you like to do?");
                System.out.println("1. View personal data");
                System.out.println("2. Edit personal data");
                System.out.println("Q to quit");
            } else {
                System.out.println("Invalid credentials.");
            }
        }
    }
}
