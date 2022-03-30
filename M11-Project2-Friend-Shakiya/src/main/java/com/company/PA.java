package com.company;

public class PA extends Crew
{
    public double hours;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public PA(String name, double amountEarned, double salary, String Department, double hours) {
        super(name, amountEarned, salary, Department);
        this.hours = hours;

    }
}
