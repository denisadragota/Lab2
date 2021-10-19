package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * desc: Test fur Klasse Hindernislauf
 * @version
 *           18 Oct 2021
 * @author
 *             Denisa Dragota
 */
class HindernislaufTest {


    /**
     * testet kalkuliereZeit() von Klasse Hindernislauf
     */
    @Test
    void kalkuliereZeit() {
        Hindernislauf h=new Hindernislauf();
        assertEquals(h.kalkuliereZeit(),30); /*die Methode muss 30 zuruckgeben*/
    }
}