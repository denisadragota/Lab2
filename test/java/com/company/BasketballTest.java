package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BasketballTest {

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        Basketball b=new Basketball();
        assertEquals(b.kalkuliereZeit(),55);
    }
}