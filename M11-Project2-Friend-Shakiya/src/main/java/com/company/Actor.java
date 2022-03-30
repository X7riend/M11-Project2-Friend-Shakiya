package com.company;

public class Actor extends Person
{
        private String role;


        public String getRole() {
                return role;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public Actor(String name, double amountEarned, double salary, String Role) {
                super(name, amountEarned, salary);
                this.role = Role;
        }
}
