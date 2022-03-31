package com.company;

public class Person
{
    private String name;
    private double salary;
    private double amountEarned;

    public Person(String name, double amountEarned,double salary) {
        this.name = name;
        this.salary = salary;
        this.amountEarned = amountEarned;
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

    public double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(double amountEarned) {
        this.amountEarned = amountEarned;
    }



}
