package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Basketball b = new Basketball();
        Fussball f = new Fussball();
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(b);
        sportList.add(f);
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereZeit(),120);
    }

    @Test
    void testKalkuliereZeit() {
        Fussball f = new Fussball();
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(f);
        Benutzer B=new Benutzer("Ion","Popescu",sportList);
        assertEquals(B.kalkuliereZeit(f),65);
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        Basketball b = new Basketball();
        Hochsprung h = new Hochsprung();
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(b);
        sportList.add(h);
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereDurchschnittszeit(),37.5);

    }
}