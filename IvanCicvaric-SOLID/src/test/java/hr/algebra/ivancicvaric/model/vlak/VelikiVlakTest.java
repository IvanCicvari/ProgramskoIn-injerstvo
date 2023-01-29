package hr.algebra.ivancicvaric.model.vlak;

import hr.algebra.ivancicvaric.model.Vlak;
import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.vozila.Kamion;
import hr.algebra.ivancicvaric.model.vozila.Kombi;
import hr.algebra.ivancicvaric.model.vozila.TipGoriva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VelikiVlakTest {
    @Test
    void dodajVozilo() {
        Vlak maliVlak = new VelikiVlak();
        Vozilo vozilo = new Kamion(TipGoriva.PLIN);
        maliVlak.DodajVozilo(vozilo);
        assertEquals(1,maliVlak.getListaVozila().size() );
        assertEquals(vozilo, maliVlak.getListaVozila().get(0));
    }
}