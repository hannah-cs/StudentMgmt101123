package org.example.Data;
import org.example.UserManagement.User;
import org.example.UserManagement.UserRole;

import java.io.*;

public class DataManagement {
    public static final String studentData = "students.csv";
    public static final String userData = "users.csv";

    public static void writeToFile(String filename, String text) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        BufferedWriter writer = new BufferedWriter(fw);
        try {
            writer.write(text);
            System.out.println("Successfully written to " + filename);
            writer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static void readUserDataFromFile(String filename) throws IOException {
        String line;
        BufferedReader reader = null;
        try {
                reader = new BufferedReader(new FileReader(filename));
                while ((line = reader.readLine()) != null) {
                    String[] userData = line.split(",");
                    if (userData.length >= 2) {
                        String username = userData[0].trim();
                        String password = userData[1].trim();
                        String userRole = userData[3].trim();
                        UserRole role = UserRole.NOTASSIGNED;
                        if (userRole.contains("ADMIN")){
                            role = UserRole.ADMIN;
                        } else if (userRole.contains("TEACHER")){
                            role = UserRole.TEACHER;
                        } else if (userRole.contains("STUDENT")){
                            role = UserRole.STUDENT;
                        }
                        User.allUsers.add(new User(username, password, role));
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
