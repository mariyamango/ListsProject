package org.example;

import java.util.Arrays;

public class Sack {
    private int size;
    private int[] elements;
    private final int INITIAL_SIZE = 10;

    public Sack() {
        this.size = 0;
        this.elements = new int[INITIAL_SIZE];
    }

    public int size(){
        return this.size;
    }

    public void addElement(int element){
        if (this.size == this.elements.length){
            int[] newElements = new int[this.elements.length * 2];
            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            this.elements = newElements;
        }
        this.elements[this.size] = element;
        this.size++;
    }

    public void removeByIndex(int index){
        if (index < 0 || index >= this.size){
            System.out.println("Invalid index");
        }
        else {
            for (int i = index; i < this.size - 1; i++){
                this.elements[i] = this.elements[i + 1];
            }
        }
        this.size--;
    }

    public void removeLast(){
        if (this.size == 0){
            System.out.println("The list is empty");
        }
        else {
            this.size--;
        }
    }

    public int get(int index){
        if (index < 0 || index >= this.size){
            System.out.println("Invalid index");
            return -1;
        }
        else {
            return this.elements[index];
        }
    }

    @Override
    public String toString() {
        if (this.size == 0){
            return "[]";
        }
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for (int i = 0; i < this.size; i++){
                builder.append(this.elements[i]);
                if (i != this.size - 1){
                    builder.append(", ");
                }
            }
            builder.append("]");
            return builder.toString();
        }
    }
}
