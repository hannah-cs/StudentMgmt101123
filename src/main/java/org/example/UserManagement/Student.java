package org.example.UserManagement;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Student extends User {
    // properties
    private String name;
    private int userId;
    private List<Course> courses = new ArrayList<>();
    private Map<User, Student> userStudentMap = new HashMap<>();
    private Map<Course, String> grades = new HashMap<>();

    //constructor
    public Student (String name, int userId){
        this.name = name;
        this.userId = userId;
        for (User user : students){
            if (userId == user.getId()){
                userStudentMap.put(user, this);
            }
        }
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
