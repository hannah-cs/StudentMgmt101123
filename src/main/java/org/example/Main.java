package org.example;
import org.example.CourseManagement.*;
import org.example.UserManagement.*;
import org.example.Menu.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Course course = new Course("Java");
        RootMenu rootMenu = new RootMenu();
        rootMenu.run();
    }
}