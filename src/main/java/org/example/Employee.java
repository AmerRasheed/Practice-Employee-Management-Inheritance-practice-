package org.example;

import java.time.LocalDate;

public class Employee


{
    private int id;
    private String name;
    private double salary=25000;
    //private LocalDate dateHired;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        //this.dateHired = dateHired;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void calculateSalary() {
        System.out.println("Do assignments");
    }
    //public LocalDate getDateHired() {}
        //return dateHired;


    //public void setDateHired(LocalDate dateHired) {}
       // this.dateHired = dateHired;



}

