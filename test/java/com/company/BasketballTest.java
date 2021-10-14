package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//Test fur Klasse Basketball
class BasketballTest {

    @Test
    void kalkuliereZeit() {
        Basketball b=new Basketball();//instanzieren
        assertEquals(b.kalkuliereZeit(),55);//die Methode muss 55 zuruckgeben
    }
}