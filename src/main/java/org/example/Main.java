package org.example;
import org.example.CourseManagement.*;
import org.example.UserManagement.*;
import org.example.Menu.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java");
        System.out.println(course.getId());
        RootMenu rootMenu = new RootMenu();
        rootMenu.run();
    }
}