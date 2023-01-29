package hr.algebra.ivancicvaric.factory;

import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.vozila.Automobil;
import hr.algebra.ivancicvaric.model.vozila.TipGoriva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoziloFactoryTest {

    @Test
    void getVozilo() {
        Vozilo vozilo =new Automobil(TipGoriva.PLIN);
        assertTrue(vozilo instanceof Automobil);
        assertEquals(TipGoriva.PLIN, vozilo.getTipGoriva());
    }
}