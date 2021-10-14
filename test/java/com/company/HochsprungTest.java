package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HochsprungTest {

    @Test
    void kalkuliereZeit() {
        Hochsprung h=new Hochsprung();
        assertEquals(h.kalkuliereZeit(),20);
    }
}