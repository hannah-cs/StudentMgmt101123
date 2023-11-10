package org.example.CourseManagement;
import org.example.UserManagement.*;

import java.util.HashMap;

public class GradingSystem {
    private char letterGrade;
    public char pctToLetter(int percentage){
        char letterGrade;
        if (percentage >= 85) {
            letterGrade = 'A';
        } else if (percentage >= 70) {
            letterGrade = 'B';
        } else if (percentage >= 55) {
            letterGrade = 'C';
        } else if (percentage >= 40) {
            letterGrade = 'D';
        } else if (percentage >= 30) {
            letterGrade = 'E';
        } else if (percentage >= 0) {
            letterGrade = 'F';
        } else {
            letterGrade = 'N';
        }
        return letterGrade;
    }
    public void assignGrade (Student student, Course course, int percentage){
        letterGrade = pctToLetter(percentage);
        student.grades.put(course, letterGrade);
    }
}
