package com.company;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Actor> Actors = new ArrayList<>();

        Actors.add(new Actor("Jane Doe", 0, 11000000, "Lead"));
        Actors.add(new Actor("Kiya", 0,5000000, "Supporting"));
        Actors.add(new Actor("Tyler", 0, 500000, "Background"));

        ArrayList<Crew> Crew1 = new ArrayList<>();
        Crew1.add(new Crew("Film Crew", 0, 550000, "Film"));
        Crew1.add(new Crew("Design Crew", 0,450000, "Design"));

        Director director1 = new Director("Arri", 0, 20000000, "Main", 0);
        PA pa1 = new PA("Jen",0,19, "Film", 350);
        Movie NoFaithers = new Movie("Drama",director1, Actors ,Crew1,100000000,0,50000000,0);

        // Problems with getSalary wont produce correct salary
        // Problems with MoneySpent as well
        NoFaithers.Payday(Actors.get(0));
        NoFaithers.Payday(pa1);
        NoFaithers.calProfit();
        director1.royaltyCalulations(NoFaithers.getProfit());



        System.out.println("Pa1 earned $ " + pa1.getAmountEarned());

        System.out.println("So far the total money spent is $" + NoFaithers.getMoneySpent());
        System.out.println("The total movie profits is $"+ NoFaithers.getProfit());
        System.out.println("The director's total royalties is $" + director1.getRoyalties());



    }
}
