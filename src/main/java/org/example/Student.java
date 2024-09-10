package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private List<Course> courses;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<Course>();
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "studentId=" + studentId +
                " firstName='" + firstName + '\'' +
                " lastName='" + lastName + "; ";
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
