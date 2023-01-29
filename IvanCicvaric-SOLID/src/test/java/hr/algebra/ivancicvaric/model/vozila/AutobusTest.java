package hr.algebra.ivancicvaric.model.vozila;

import hr.algebra.ivancicvaric.model.Vozilo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutobusTest {

    @Test
    void izracunajCijenu() {
        Autobus automobil=new Autobus(TipGoriva.PLIN);
        int expRes=50;

        assertEquals(70,automobil.IzracunajCijenu());
    }
}