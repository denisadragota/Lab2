package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * desc: Test fur Klasse Fussball
 * @version
 *           18 Oct 2021
 * @author
 *             Denisa Dragota
 */

class FussballTest {

    /**
     * testet kalkuliereZeit() von Klasse Fussball
     */
    @Test
    void kalkuliereZeit() {
        Fussball f=new Fussball();
        assertEquals(f.kalkuliereZeit(),65); /*die Methode muss 65 zuruckgeben*/
    }
}