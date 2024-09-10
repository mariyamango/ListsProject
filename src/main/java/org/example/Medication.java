package org.example;

public class Medication {

    private String name;
    private double price;
    private boolean available;

    public Medication(String name, Double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean getAvailability() {
        return available;
    }

    @Override
    public String toString() {
        return "Medication: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                "; ";
    }
}
