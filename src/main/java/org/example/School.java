package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentsOfSchool;

    public School() {
        studentsOfSchool = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsOfSchool.add(student);
    }

    public Student getStudentById(int studentIdToFind) {
        for (Student student : studentsOfSchool) {
            if (student.getStudentId() == studentIdToFind){
                return student;
            }
        }
        System.out.println("No students with id " + studentIdToFind + " were found.");
        return null;
    }

    public void removeStudentById(int idOfStudentToRemove) {
        for (int i = 0; i < studentsOfSchool.size(); i++) {
            if (studentsOfSchool.get(i).getStudentId() == idOfStudentToRemove){
                studentsOfSchool.remove(i);}
            }
        System.out.println("The student with id " + idOfStudentToRemove + " was removed.");
    }

    public void schoolStudentsListToPrint() {
        if (studentsOfSchool.isEmpty()) {
            System.out.println("There are no students in the school.");
        }
        else {
            System.out.println("The students in the school:");
            for (Student student : studentsOfSchool) {
                System.out.println(student);
            }
        }
    }

    public List<Course> getStudentCourses(int studentId) {
        for (Student student : studentsOfSchool) {
            if (student.getStudentId() == studentId){
                return student.getCourses();
            }
        }
        return null;
    }
}
