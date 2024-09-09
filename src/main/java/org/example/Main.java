//Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
//Step 2: Create a Java List for elements of type "Student" and add multiple students.
//Step 3: Create a class "School" to which students can be added through a method ('addStudent').
//Step 4: Implement a method to print all students of the school (as text, to the console).
//Step 5: Add a method to find a student by their ID. The found student should be returned.
//Step 6: Create a method to remove a student from the school.
//Expand the Java-List project with a class called "Course" that has the following properties: course name, instructor, room.
//Add a method to the Student class to add courses to the student (courses in which the student is participating).
//Implement a method within the School class to retrieve all courses of a specific student (based on a student ID).

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Bobby","Brown"));
        students.add(new Student(2,"Soul","Smith"));
        System.out.println(students);
        System.out.println();

        School school = new School();
        school.addStudent(students.get(0));
        school.addStudent(new Student(3,"Margo","Miller"));
        school.addStudent(new Student(4,"Jane","Johnson"));
        school.addStudent(new Student(5,"Dan","Davis"));
        school.schoolStudentsListToPrint();
        school.removeStudentById(1);
        System.out.println("The school student after removal: ");
        school.schoolStudentsListToPrint();
        System.out.println();

        int idStudentToFind = 3;
        System.out.println("The found student with id " + idStudentToFind + ": " + school.getStudentById(idStudentToFind));
        int idOfNotExistingStudent = 100;
        System.out.println("The found student with id "+ idOfNotExistingStudent + ": " + school.getStudentById(idOfNotExistingStudent));
        System.out.println();

        int idStudentToAddCourse = 5;
        school.getStudentById(idStudentToAddCourse).addCourse(new Course("Mathematics", "Teacher Wilson", 101));
        System.out.println("The courses of student with id " + idStudentToAddCourse + ": " + school.getStudentCourses(idStudentToAddCourse));
    }
}