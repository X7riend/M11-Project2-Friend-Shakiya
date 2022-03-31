package com.company;

import java.util.List;

public class Movie
{
    public double calProfit ()
    {
        Profit = (Budget - MoneySpent) + MoneyEarned;
        return Profit;
    }
    // Very confused about how to pay each actor
    // so I just calculated for 1 actor

    public double Payday(Actor a)
    {
            double pay = a.getSalary() / 4;

            a.setAmountEarned(pay + a.getAmountEarned());
            MoneySpent  += pay;

        return pay;
    }
    public double  Payday(PA pa1)
    {
        double pay = pa1.hours * pa1.getSalary();
        pa1.setAmountEarned(pay += pay);
        MoneySpent += pay;
        return pay;
    }

    public double getBudget() {
        return Budget;
    }

    public void setBudget(double budget) {
        Budget = budget;
    }

    public double getMoneySpent() {
        return MoneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        MoneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return MoneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        MoneyEarned = moneyEarned;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double profit) {
        Profit = profit;
    }

    public Director getDir() {
        return Dir;
    }

    public void setDir(Director dir) {
        Dir = dir;
    }

    public List<Actor> getActors() {
        return Actors;
    }

    public void setActors(List<Actor> actors) {
        Actors = actors;
    }

    public List<Crew> getCrew1() {
        return Crew1;
    }

    public void setCrew1(List<Crew> crew1) {
        Crew1 = crew1;
    }

    public Movie(String Genre, Director Dir, List<Actor> Actors , List<Crew> Crew1, double Budget, double MoneySpent, double MoneyEarned, double Profit)
    {
        this.Genre = Genre;
        this.Dir = Dir;
        this.Actors = Actors;
        this.Crew1 = Crew1;
        this.Budget = Budget;
        this.MoneySpent = MoneySpent;
        this.MoneyEarned = MoneyEarned;
        this.Profit = Profit;
    }

    private double Budget;
    private double MoneySpent;
    private double MoneyEarned;
    private String Genre;
    private double Profit;
    private Director Dir;
    private List<Actor> Actors;
    private List<Crew> Crew1;

}
