package org.example.CourseManagement;
import org.example.UserManagement.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    // properties
    private String name;
    private static int uid = 0;
    private int id;
    public static List<Course> allCourses = new ArrayList<>();
    private List<Student> enrolledStudents = new ArrayList<>();

    //constructor
    public Course(String name) {
        this.name = name;
        uid++;
        this.id = uid;
        allCourses.add(this);
    }

    // enroll method
    public void enroll(Student student){
        this.enrolledStudents.add(student);
        student.enrolledCourses.add(this);
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //CRUD
    public void delete(Course course){
        allCourses.remove(course);
    }

    public void update(Course course, String name){
        this.name = name;
    }
}