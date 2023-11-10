package org.example.Menu.StudentSubMenu;

import org.example.CourseManagement.Course;
import org.example.CourseManagement.GradingSystem;
import org.example.UserManagement.Student;
import org.example.UserManagement.User;

import java.util.Scanner;

public class GradingMenu {
    public void run() {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
            GradingSystem gradingSystem = new GradingSystem();
            System.out.println("Grade manager.");
            System.out.println("Enter course ID");
            int courseId = scanner.nextInt();
            Course foundCourse = null;
            scanner.nextLine();
            for (Course course : Course.allCourses){
                if (course.getId() == courseId){
                    foundCourse = course;
                }
            }
            if (foundCourse == null){
                System.out.println("Course not found. try again.");
            } else {
                System.out.println("Enter student ID");
                int studentId = scanner.nextInt();
                Student foundStudent = null;
                scanner.nextLine();
                for (User user : User.students){
                    if (user.getId() == studentId) {
                        if (Student.userStudentMap.containsKey(user)) {
                            foundStudent = Student.userStudentMap.get(user);
                        }
                    }
                }
                if (foundStudent == null){
                    System.out.println("Student not found. Try again.");
                } else {
                    if (foundStudent.grades.containsKey(foundCourse)){
                        System.out.println(foundStudent.getName()+"'s current grade for "+foundCourse.getName()+": "+foundStudent.grades.get(foundCourse));
                        System.out.println("Enter updated score as percentage");
                        int percentage = scanner.nextInt();
                        scanner.nextLine();
                        gradingSystem.assignGrade(foundStudent, foundCourse, percentage);
                        System.out.println("Updated grade: "+foundStudent.grades.get(foundCourse));
                    } else {
                        System.out.println("Setting new "+foundCourse.getName()+" grade for "+foundStudent.getName());
                        System.out.println("Enter updated score as percentage");
                        int percentage = scanner.nextInt();
                        scanner.nextLine();
                        gradingSystem.assignGrade(foundStudent, foundCourse, percentage);
                        System.out.println("Grade set: "+foundStudent.grades.get(foundCourse));
                    }
                }
            }
            exitLoop = true;
        }
    }
}
