package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * desc: Test fur Klasse Basketball
 * @version
 *           18 Oct 2021
 * @author
 *              Denisa Dragota
 */

class BasketballTest {

    /**
     * desc: testet kalkuliereZeit() von Klasse Basketball
     */
    @Test
    void kalkuliereZeit() {
        Basketball b=new Basketball();
        assertEquals(b.kalkuliereZeit(),55); /*die Methode muss 55 zuruckgeben*/
    }
}