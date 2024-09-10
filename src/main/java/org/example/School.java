package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<Integer,Student> studentsOfSchool;

    public School() {
        studentsOfSchool = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentsOfSchool.put(student.getStudentId(), student);
    }

    public Student getStudentById(int studentIdToFind) {
        if (studentsOfSchool.containsKey(studentIdToFind)) {
            return studentsOfSchool.get(studentIdToFind);
        }
        System.out.println("No students with id " + studentIdToFind + " were found.");
        return null;
    }

    public void removeStudentById(int idOfStudentToRemove) {
        studentsOfSchool.remove(idOfStudentToRemove);
        System.out.println("The student with id " + idOfStudentToRemove + " was removed.");
    }

    public void schoolStudentsListToPrint() {
        if (!studentsOfSchool.isEmpty()) {
            System.out.println("Students in the school: ");
            for (Student student : studentsOfSchool.values()) {
                System.out.print(student);
            }
        }
        else {
            System.out.println("There are no students in the school.");
        }
    }

    public List<Course> getStudentCourses(int studentId) {
        if (studentsOfSchool.containsKey(studentId)) {
            return studentsOfSchool.get(studentId).getCourses();
        }
        return null;
    }
}
