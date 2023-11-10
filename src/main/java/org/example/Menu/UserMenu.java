package org.example.Menu;
import org.example.Menu.UserSubMenu.*;

import java.io.IOException;
import java.util.Scanner;

public class UserMenu {
    public void run() throws IOException {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("User management:");
            System.out.println("1. Log in existing user");
            System.out.println("2. Register new user");
            System.out.println("Q to quit");
            String choice2 = scanner.nextLine();
            switch (choice2) {
                case "1":
                    LoginMenu loginMenu = new LoginMenu();
                    loginMenu.run();
                    break;
                case "2":
                    RegisterMenu registerMenu = new RegisterMenu();
                    registerMenu.run();
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
