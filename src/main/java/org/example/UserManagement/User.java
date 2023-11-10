package org.example.UserManagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    public class UserInfo {
        private String username;
        private String password;
        private UserRole userRole;

        public User(String username, String password, UserRole userRole) {
            this.username = username;
            this.password = password;
            this.userRole = userRole;
            UserLists.allUsers.add(this);
            switch (userRole){
                case (UserRole.ADMIN) : UserLists.admins.add(this);
                    break;
                case (UserRole.TEACHER) : UserLists.teachers.add(this);
                    break;
                case (UserRole.STUDENT) : UserLists.students.add(this);
                    break;
                default :
            }
        }

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
    }

    public class UserLists {
    private static List<User> allUsers = new ArrayList<>();
    private static List<User> students = new ArrayList<>();
    private static List<User> teachers = new ArrayList<>();
    private static List<User> admins = new ArrayList<>();
    }
}
