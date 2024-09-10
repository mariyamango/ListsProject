package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String,Medication> medications;

    public Pharmacy() {
        medications = new HashMap<>();
    }

    public void saveMedication(Medication m) {
        medications.put(m.getName(),m);
    }

    public int getCount(){
        return medications.size();
    }

    public Medication find(String medicationName){
        return medications.get(medicationName);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
        System.out.println("Medication was removed: " + medicationName);
    }

    @Override
    public String toString() {
        if (medications.isEmpty()){
            return "No medications in the Pharmacy.";
        }
        System.out.println("Medications in Pharmacy:");
        StringBuilder string = new StringBuilder();
        for (Medication m : medications.values()) {
            string.append(m.toString()).append("\n");
        }
        return string.toString();
    }
}
