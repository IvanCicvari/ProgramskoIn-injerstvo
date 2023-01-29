package hr.algebra.ivancicvaric.model.vozila;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomobilTest {

    @Test
    void izracunajCijenu() {
        Automobil automobil=new Automobil(TipGoriva.PLIN);
        int expRes=50;

        assertEquals(expRes,automobil.IzracunajCijenu());
    }
}