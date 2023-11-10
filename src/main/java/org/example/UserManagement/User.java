package org.example.UserManagement;

import java.util.ArrayList;
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

        // constructor
        public User(String username, String password, UserRole userRole) {
            this.username = username;
            this.password = password;
            this.userRole = userRole;
            this.id = uid++;
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