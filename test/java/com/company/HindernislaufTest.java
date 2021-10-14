package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test fur Klasse Hindernislauf
class HindernislaufTest {

    @Test
    void kalkuliereZeit() {
        Hindernislauf h=new Hindernislauf(); //bilden eine neue Instanz der Klasse Hindernislauf
        assertEquals(h.kalkuliereZeit(),30);//die Methode muss 30 zuruckgeben
    }
}