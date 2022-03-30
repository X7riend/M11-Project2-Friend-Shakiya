package com.company;

public class Director extends Crew{

    private double royalties;
    public double getRoyalties() {
        return royalties;
    }

    public void setRoyalties(double royalties) {
        this.royalties = royalties;
    }



        public Director(String name, double amountEarned, double salary, String Department, double royalties)
        {
            super(name, amountEarned, salary, Department);
            this.royalties = royalties;
        }


        public double royaltyCalulations(double profit)
        {
            royalties = profit * 0.01;
            return royalties;
        }



}
