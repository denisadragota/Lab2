package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HindernislaufTest {

    @Test
    void kalkuliereZeit() {
        Hindernislauf h=new Hindernislauf();
        assertEquals(h.kalkuliereZeit(),30);
    }
}