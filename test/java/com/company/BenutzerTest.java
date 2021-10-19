package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests fur Klasse Benutzer
 * @version
 *          18 Oct 2021
 * @author
 *            Denisa Dragota
 */

class BenutzerTest {


    /**
     * desc: testet kalkuliereZeit() von Klasse Benutzer
     */
    @Test
    void kalkuliereZeit() {
        ArrayList<Sport> sportList1=new ArrayList<Sport>();   /*leere Liste*/
        Benutzer B1=new Benutzer("Andrei","Mihai",sportList1);
        assertEquals(B1.kalkuliereZeit(),0); /*Summe aller Sporten= 0*/

        Basketball BasketMontag  = new Basketball();
        Fussball FussballMontag = new Fussball();
        ArrayList<Sport> sportList2=new ArrayList<Sport>();
        sportList2.add(BasketMontag );/*fugt Lieblingssport*/
        sportList2.add(FussballMontag);
        Benutzer B2=new Benutzer("Ion","Popescu",sportList2);
        assertEquals(B2.kalkuliereZeit(),120);/*Summe aller Sporten= 55+65=120*/
    }

    /**
     * desc: testet kalkuliereZeit(Sport) von Klasse Benutzer
     */
    @Test
    void testKalkuliereZeit() {
        Fussball FussballMontag = new Fussball();
        Fussball FussballFreitag = new Fussball();
        Basketball BasketFreitag = new Basketball();
        ArrayList<Sport> sportList=new ArrayList<Sport>();
        sportList.add(FussballMontag);
        sportList.add(FussballFreitag);
        sportList.add(BasketFreitag);
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereZeit(new Fussball()),130); /* 2*65=130 muss es dauern */
        assertEquals(B.kalkuliereZeit(new Hochsprung()),0);/*der Benutzer hat kein Hochsprung in der Liste*/
    }

    /**
     * desc: testet kalkuliereDurchschnittszeit() von Klasse Benutzer
     */
    @Test
    void kalkuliereDurchschnittszeit() {

        ArrayList<Sport> sportList=new ArrayList<Sport>(); /*leere Array*/
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertEquals(B.kalkuliereDurchschnittszeit(),0); /*wenn kein Sport existiert, dann 0*/

        Basketball BasketMontag = new Basketball();
        Hochsprung HochSprungFreitag = new Hochsprung();
        B.addSportart(BasketMontag); /*fugt Sport hinzu*/
        B.addSportart(HochSprungFreitag);

        assertEquals(B.kalkuliereDurchschnittszeit(),37.5); /*Durchschnitt muss (55+20)/2=37.5 sein*/


        Fussball FussballFreitag = new Fussball();
        Basketball BasketFreitag = new Basketball();

        ArrayList<Sport> sports=new ArrayList<Sport>();
        sports.add(BasketMontag);
        sports.add(FussballFreitag);
        sports.add(BasketFreitag);
        Benutzer B2=new Benutzer("Ion","Popescu",sports);
        assertEquals(B2.kalkuliereDurchschnittszeit(),58.33,0.01); /*0.01 precion loss*/
    }

    /**
     * desc: testet addSportart(Sport) von Klasse Benutzer
     */
    @Test
    void addSportart() {

        Basketball BasketMontag = new Basketball();
        Hochsprung HochsprungDienstag = new Hochsprung();
        ArrayList<Sport> sportList=new ArrayList<Sport>(); /*leere Liste der Sportarten*/
        sportList.add(BasketMontag);//hat nur Basketball
        Benutzer B=new Benutzer("Ion","Popescu",sportList);

        assertFalse(B.getSport().contains(HochsprungDienstag));/*jetzt enthalt die Liste nicht Hochsprung*/

        B.addSportart(HochsprungDienstag);/*fugt Hochsprung zur Liste*/

        assertTrue(B.getSport().contains(HochsprungDienstag));/*jetzt enthalt die Liste auch Hochsprung*/
        assertEquals(B.getSport().size(),2);/*jetzt enthalt die Liste 2 Elemente*/

    }
}