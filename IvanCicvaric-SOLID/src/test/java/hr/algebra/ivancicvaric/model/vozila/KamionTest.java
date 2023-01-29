package hr.algebra.ivancicvaric.model.vozila;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KamionTest {

    @Test
    void izracunajCijenu() {

            Kamion automobil=new Kamion(TipGoriva.PLIN);
            int expRes=90;

            assertEquals(expRes,automobil.IzracunajCijenu());

    }
}