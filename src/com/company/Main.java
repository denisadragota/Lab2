package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Basketball BasketMontag = new Basketball();
        Fussball FussballFreitag = new Fussball();
        Basketball BasketFreitag = new Basketball();

        ArrayList<Sport> sports=new ArrayList<Sport>();
        sports.add(BasketMontag);
        sports.add(FussballFreitag);
        sports.add(BasketFreitag);
        Benutzer B=new Benutzer("Ion","Popescu",sports);

        System.out.println("Total Zeit Sport: "+B.kalkuliereZeit());
        System.out.println("Zeit fur Basketball: "+B.kalkuliereZeit(new Basketball()));
        System.out.println("Zeit fur Fussball: "+B.kalkuliereZeit(new Fussball()));
        System.out.println("Zeit fur Hochsprung: "+B.kalkuliereZeit(new Hochsprung()));
        System.out.println("Zeit fur Hindernislauf: "+B.kalkuliereZeit(new Hindernislauf()));
        System.out.print("Durchschnittszeit: ");
        System.out.printf("%.2f\n",B.kalkuliereDurchschnittszeit());

        }
    }

