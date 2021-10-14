package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Basketball b = new Basketball();
        Fussball f = new Fussball();
        //System.out.println(b.kalkuliereZeit());
        ArrayList<Sport> sports=new ArrayList<Sport>();
        sports.add(b);
        sports.add(f);
        Benutzer B=new Benutzer("Ion","Popescu",sports);
        System.out.println(B.kalkuliereZeit());
    }
}
