package org.example.UserManagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private UserRole userRole;
    private static List<User> allUsers = new ArrayList<>();
    private static List<User> students = new ArrayList<>();
    private static List<User> teachers = new ArrayList<>();
    private static List<User> admins = new ArrayList<>();
    public User(String username, String password, UserRole userRole) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        allUsers.add(this);
        switch (userRole){
            case (UserRole.ADMIN) : admins.add(this);
            break;
            case (UserRole.TEACHER) : teachers.add(this);
            break;
            case (UserRole.STUDENT) : students.add(this);
            break;
            default :
        }
    }
}
