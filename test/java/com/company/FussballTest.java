package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Test fur Klasse Fussball
class FussballTest {

    @Test
    void kalkuliereZeit() {
        Fussball f=new Fussball();//bilden eine neue Instanz der Klasse Fussball
        assertEquals(f.kalkuliereZeit(),65);//die Methode muss 65 zuruckgeben
    }
}