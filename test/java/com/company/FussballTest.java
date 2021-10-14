package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FussballTest {

    @Test
    void kalkuliereZeit() {
        Fussball f=new Fussball();
        assertEquals(f.kalkuliereZeit(),65);
    }
}