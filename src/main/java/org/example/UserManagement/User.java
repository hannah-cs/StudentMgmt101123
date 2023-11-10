package org.example.UserManagement;
import org.example.Data.DataManagement;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
        // properties
        private String username;
        private String password;
        private UserRole userRole;
        private static int uid = 0;
        private int id;

        //user lists
        public static List<User> allUsers = new ArrayList<>();
        public static List<User> students = new ArrayList<>();
        public static List<User> teachers = new ArrayList<>();
        public static List<User> admins = new ArrayList<>();
        private static Map<String, String> loginCredentials = new HashMap<>();

        // constructor
        public User(String username, String password, UserRole userRole) throws IOException {
            this.username = username;
            this.password = password;
            this.userRole = userRole;
            uid++;
            this.id = uid;
            allUsers.add(this);
            if (userRole.equals(UserRole.ADMIN)) {
                admins.add(this);
            } else if (userRole.equals(UserRole.TEACHER)) {
                teachers.add(this);
            } else if (userRole.equals(UserRole.STUDENT)) {
                students.add(this);
            }
            loginCredentials.put(username, password);
        }

        //register and log in
        public static boolean login(String username, String password){
            if (loginCredentials.containsKey(username)){
                String correctPassword = loginCredentials.get(username);
                if (correctPassword.equals(password)) {
                    return true;
            }
        }
        return false;
        }

        public static User registerNewUser(String username, String password, UserRole userRole) throws IOException {
            User newUser = new User(username, password, userRole);
            DataManagement.writeToFile(DataManagement.userData, "\n" + username + "," + password + "," + userRole);
            return newUser;
        }

        //getters and setters

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public UserRole getUserRole() {
            return userRole;
        }

        public void setUserRole(UserRole userRole) {
            this.userRole = userRole;
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
    }