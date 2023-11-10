package org.example.Menu.UserSubMenu;
import org.example.UserManagement.*;
import org.example.Menu.StudentSubMenu.*;
import org.example.Data.*;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Scanner;

public class RegisterMenu {
    public void run() throws IOException {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Register new user.");
            System.out.println("Enter username:");
            String user = scanner.nextLine();
            System.out.println("Enter password:");
            String pw = scanner.nextLine();
            System.out.println("User type:");
            System.out.println("1. Admin");
            System.out.println("2. Teacher");
            System.out.println("3. Student");
            System.out.println("Q to quit");
            String nextChoice = scanner.nextLine();
            UserRole userRole = UserRole.NOTASSIGNED;
            switch (nextChoice) {
                case "Q":
                    exitLoop = true;
                    break;
                case "q":
                    exitLoop = true;
                    break;
                case "1":
                    userRole = UserRole.ADMIN;
                    break;
                case "2" :
                    userRole = UserRole.TEACHER;
                    break;
                case "3" :
                    userRole = UserRole.STUDENT;
                    break;
                default :
                    System.out.println("Not a valid option.");
            }
            User.registerNewUser(user, pw, userRole);
            System.out.println("Successfully registered new user.");
                    if (userRole.equals(UserRole.STUDENT)){
                        StudentRegMenu studentRegMenu = new StudentRegMenu();
                        studentRegMenu.run();
                    }
            System.out.println("Would you like to register another user? (y/n)");
            String goAgain = scanner.nextLine();
            if (goAgain.equals("n") || goAgain.equals("N")) {
                exitLoop = true;
            }
        }
    }
}
