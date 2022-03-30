package com.company;

public class Crew extends Person

{
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

    private String Department;

}
