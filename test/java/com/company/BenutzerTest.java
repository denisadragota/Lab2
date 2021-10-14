package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
//Tests fur Benutzer
class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Basketball BasketMontag  = new Basketball();//instanzieren eine neue Instanz der Klasse Basketball
        Fussball FussballMontag = new Fussball();//instanzieren eine neue Instanz der Klasse Fussball
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(BasketMontag );//fugt Lieblingssport
        sportList.add(FussballMontag);//fugt Lieblingssport
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereZeit(),120);//Summe aller Sporten= 55+65=120
    }

    @Test
    void testKalkuliereZeit() {
        Mannschaftssport FussballMontag = new Fussball();//instanzieren eine neue Instanz der Klasse Fussball
        Mannschaftssport FussballFreitag = new Fussball();//instanzieren eine neue Instanz der Klasse Fussball
        Mannschaftssport BasketFreitag = new Basketball();//instanzieren eine neue Instanz der Klasse Basketball
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(FussballMontag);
        sportList.add(FussballFreitag);
        sportList.add(BasketFreitag);
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereZeit(FussballMontag),130);//2*65=130 muss es dauern
        assertEquals(B.kalkuliereZeit(new Hochsprung()),0);//der Benutzer hat kein Hochsprung in der Liste
    }

    @Test
    void kalkuliereDurchschnittszeit() {

        ArrayList<Sport> sportList=new ArrayList<Sport>();//leere Array
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereDurchschnittszeit(),0);//wenn kein Sport existiert, dann 0

        Mannschaftssport BasketMontag = new Basketball();//instanzieren eine neue Instanz der Klasse Basketball
        Leichtathletik HochSprungFreitag = new Hochsprung();//instanzieren eine neue Instanz der Klasse Hochsprung
        B.addSportart(BasketMontag); //fugt Sport hinzu
        B.addSportart(HochSprungFreitag); //fugt Sport hinzu

        assertEquals(B.kalkuliereDurchschnittszeit(),37.5);//Durchschnitt muss (55+20)/2=37.5 sein


        Mannschaftssport FussballFreitag = new Fussball();
        Mannschaftssport BasketFreitag = new Basketball();

        ArrayList<Sport> sports=new ArrayList<Sport>();
        sports.add(BasketMontag);
        sports.add(FussballFreitag);
        sports.add(BasketFreitag);
        Benutzer B2=new Benutzer("Ion","Popescu",sports);
        //assertEquals(B2.kalkuliereDurchschnittszeit(),58.33);
        assertEquals(B2.kalkuliereDurchschnittszeit(),58.33,0.01);//0.01 precion loss
    }

    @Test
    void addSportart() {

        Mannschaftssport BasketMontag = new Basketball();//instanzieren eine neue Instanz der Klasse Basketball
        Leichtathletik HochsprungDienstag = new Hochsprung();//instanzieren eine neue Instanz der Klasse Hochsprung
        ArrayList<Sport> sportList=new ArrayList<Sport>();//leere Liste der Sportarten
        sportList.add(BasketMontag);//hat nur Basketball
        Benutzer B=new Benutzer("Ion","Popescu",sportList);//instanzieren eine neue Instanz von Klasse Benutzer

        assertFalse(B.getSport().contains(HochsprungDienstag));//jetzt enthalt die Liste nicht Hochsprung


        B.addSportart(HochsprungDienstag);//fugt Hochsprung zur Liste

        assertTrue(B.getSport().contains(HochsprungDienstag));//jetzt enthalt die Liste auch Hochsprung
        assertEquals(B.getSport().size(),2);//jetzt enthalt die Liste 2 Elemente

    }
}