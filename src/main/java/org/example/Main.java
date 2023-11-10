package org.example;
import org.example.CourseManagement.*;
import org.example.UserManagement.*;
import org.example.Menu.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java");
        RootMenu rootMenu = new RootMenu();
        rootMenu.run();
    }
}