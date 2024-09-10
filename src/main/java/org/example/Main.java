package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Step 1: Convert your application from the List lecture so that the School Object uses a Hashmap instead of an ArrayList.
//Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
//Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
//Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
//Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
//Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name.
// If no Medication with this name is found, the method should return null.
//Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
//Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
//If you have already completed this task earlier, feel free to solve some tasks on Codewars.

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