package org.example.UserManagement;
import org.example.CourseManagement.*;
import org.example.Data.DataManagement;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Student extends User {
    // properties
    private String name;
    private int userId;
    public static List<Student> allStudents = new ArrayList<>();
    public List<Course> enrolledCourses = new ArrayList<>();
    public static Map<User, Student> userStudentMap = new HashMap<>();
    public Map<Course, Character> grades = new HashMap<>();
    private User user;

    //constructor
    public Student(String name, int userId) throws IOException {
        super("usernameNotSet", "passwordNotSet", UserRole.STUDENT);
        this.name = name;
        this.userId = userId;
        for (User user : allUsers) {
            if (userId == user.getId()) {
                this.user = user;
                userStudentMap.put(user, this);
                break;
            }
        }
        DataManagement.writeToFile(DataManagement.studentData, "\n"+this.name+","+user.getId());
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
