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
        System.out.println(school.getStudentById(idOfNotExistingStudent));
        System.out.println();

        int idStudentToAddCourse = 5;
        school.getStudentById(idStudentToAddCourse).addCourse(new Course("Mathematics", "Teacher Wilson", 101));
        System.out.println("The courses of student with id " + idStudentToAddCourse + ": " + school.getStudentCourses(idStudentToAddCourse));
        System.out.println();

        Sack sack = new Sack();
        sack.addElement(1);
        sack.addElement(2);
        sack.addElement(3);
        sack.addElement(4);
        sack.addElement(5);
        System.out.println(sack);
        System.out.println("Getting the element with index 0: " + sack.get(0));
        System.out.println("The size of sack: " + sack.size());
        sack.removeLast();
        System.out.println("Removing the las element: " + sack);
        sack.removeByIndex(1);
        System.out.println("Removing the element with index 1: " + sack);
        System.out.println();

        //Medication + Pharmacy
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication(new Medication("Aspirin",5.00,true));
        pharmacy.saveMedication(new Medication("Sinupret",4.30,true));
        pharmacy.saveMedication(new Medication("Bepanthen",4.90,false));
        pharmacy.saveMedication(new Medication("Orthomol",7.30,false));
        pharmacy.saveMedication(new Medication("Grippostad",2.00,true));
        pharmacy.saveMedication(new Medication("Thomapyrin",6.10,true));
        System.out.println(pharmacy);
        System.out.println("Medications quantity in the Pharmacy: " + pharmacy.getCount());
        System.out.println(pharmacy.find("Bepanthen"));
        pharmacy.delete("Grippostad");
        System.out.println(pharmacy);
    }
}