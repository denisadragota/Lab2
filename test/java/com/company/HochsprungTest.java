package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * desc: Test fur Klasse Hochsprung
 * @version
 *            18 Oct 2021
 * @author
 *              Denisa Dragota
 */
class HochsprungTest {

    /**
     * desc: testet kalkuliereZeit() von Klasse Hochsprung
     */
    @Test
    void kalkuliereZeit() {
        Hochsprung h=new Hochsprung();
        assertEquals(h.kalkuliereZeit(),20);//die Methode muss 20 zuruckgeben
    }
}