package org.example.Menu.StudentSubMenu;
import org.example.CourseManagement.*;
import org.example.UserManagement.*;
import java.util.Scanner;

public class CourseEnrollMenu {
    public void run() {
        boolean exitLoop = false;
        while (!exitLoop) {
            Scanner scanner = new Scanner(System.in);
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
                    foundCourse.enroll(foundStudent);
                    System.out.println("Enrolled "+foundStudent.getName()+" in "+foundCourse.getName());
                }
            }
            exitLoop = true;
        }
    }
}
