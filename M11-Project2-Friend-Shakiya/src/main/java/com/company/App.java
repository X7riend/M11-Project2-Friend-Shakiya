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
        PA pa1 = new PA("Jen",0,19.00, "Film", 0);
        //Movie NoFaithers = new Movie("Drama",Director.director1, Actors[],Crew1[],100000000,0,0,0)

    }
}
