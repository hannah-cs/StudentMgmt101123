package org.example.Menu.StudentSubMenu;
import org.example.UserManagement.*;

import java.util.Scanner;

public class StudentRegMenu {
    public void run() {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Register new student.");
            System.out.println("Create login details:");
            System.out.println("Create student username");
            String studentUsername = scanner.nextLine();
            System.out.println("Create student password");
            String studentPW = scanner.nextLine();
            User user = new User(studentUsername, studentPW, UserRole.STUDENT);
            int studentUserId = user.getId();
            System.out.println("Enter student full name");
            String studentName = scanner.nextLine();
            Student student = new Student(studentName, studentUserId);
            System.out.println(user.getId());
            System.out.println(studentName+" has been registered. Would you like to register another student? (y/n)");
            String goAgain = scanner.nextLine();
            if (goAgain.equals("n") || goAgain.equals("N")) {
                exitLoop = true;
            }
        }
    }
}
