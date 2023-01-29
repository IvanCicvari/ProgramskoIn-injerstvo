package hr.algebra.ivancicvaric.model.vozila;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KombiTest {

    @Test
    void izracunajCijenu() {

        Kombi automobil=new Kombi(TipGoriva.PLIN);
        int expRes=80;

        assertEquals(expRes,automobil.IzracunajCijenu());

    }

}