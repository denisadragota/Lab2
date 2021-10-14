package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Test fur Klasse Hochsprung
class HochsprungTest {

    @Test
    void kalkuliereZeit() {
        Hochsprung h=new Hochsprung(); //instanzieren eine neue Instanz der Klasse Hochsprung
        assertEquals(h.kalkuliereZeit(),20);//die Methode muss 20 zuruckgeben
    }
}