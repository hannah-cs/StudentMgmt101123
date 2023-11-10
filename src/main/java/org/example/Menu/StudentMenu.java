package org.example.Menu;
import org.example.Menu.StudentSubMenu.CourseEnrollMenu;
import org.example.Menu.StudentSubMenu.GradingMenu;
import org.example.Menu.StudentSubMenu.StudentRegMenu;
import org.example.UserManagement.UserRole;

import java.io.IOException;
import java.util.Scanner;

public class StudentMenu {
    public void run() throws IOException {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Student management. Select an option:");
            System.out.println("1. Register new student");
            System.out.println("2. Enroll student in course");
            System.out.println("3. Assign grade for course");
            System.out.println("Q to quit.");
            String nextChoice = scanner.nextLine();
            switch (nextChoice) {
                case "Q":
                    exitLoop = true;
                    break;
                case "q":
                    exitLoop = true;
                    break;
                case "1":
                    StudentRegMenu studentRegMenu = new StudentRegMenu();
                    studentRegMenu.run();
                    break;
                case "2" :
                    CourseEnrollMenu courseEnrollMenu = new CourseEnrollMenu();
                    courseEnrollMenu.run();
                    break;
                case "3" :
                    GradingMenu gradingMenu = new GradingMenu();
                    gradingMenu.run();
                    break;
                default :
                    System.out.println("Not a valid option.");
            }
        }
    }
}

