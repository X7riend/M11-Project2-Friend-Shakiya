package com.company;

public class Crew extends Person

{
    private String Department;

    public Crew (String name, double amountEarned, double salary, String Department)
    {
        super(name, amountEarned, salary);
        this.Department = Department;
    };
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

}
