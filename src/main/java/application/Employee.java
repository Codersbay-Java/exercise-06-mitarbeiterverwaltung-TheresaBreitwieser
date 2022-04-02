package application;

import java.util.Random;

public class Employee {

    String firstName;
    String lastName;
    int id;
    final Department dept;


    public Employee(String firstName, String lastName, Department dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = getRandomID();
        this.dept = dept;
    }


    //default
    public Employee() {
        firstName = "Max";
        lastName = "Mustermann";
        id = getRandomID();
        dept = new Department();

    }


    public void print() {
        System.out.println("Der Mitarbeiter " + firstName + " " + lastName + " arbeitet in der Abteilung " + dept.name + " " + dept.city);
    }

    public boolean isEquals(Employee other) {
        if (id == other.id)
            return true;
        else {
            return false;
        }
    }

    public int getRandomID() {
        Random random=new Random();
        return random.nextInt(1001);
    }

    public String toString() {
        return "The employee: " + this.id +" "+ this.firstName +" "+ this.lastName + " works in the dpeartment: " + this.dept.name + " in " + this.dept.city;
    }


}
