package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

        private String[] clients; //= {"Willys","Coop","Maxi"};
        private int acquiredClients=0;

    public SalesPerson(int id, String name, double salary, String clients[], int acquiredClients) {
        super(id, name, salary);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Acquire clients");


    }


    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients='" + clients + '\'' +
                ", acquiredClients=" + acquiredClients +
                '}';
    }


}


