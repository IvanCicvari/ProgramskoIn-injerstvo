package hr.algebra.ivancicvaric.model;

import hr.algebra.ivancicvaric.model.vozila.Automobil;
import hr.algebra.ivancicvaric.model.vozila.TipGoriva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZaposlenikTest {

    @Test
    void getPlaca() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);
        Zaposlenik zaposlenik=new Zaposlenik("Marko","Maric",10);

        zaposlenik.ParkirajVozilo(vozilo);
        assertEquals(5,zaposlenik.getPlaca());
    }

    @Test
    void getPrihod() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);
        Zaposlenik zaposlenik=new Zaposlenik("Marko","Maric",10);

        zaposlenik.ParkirajVozilo(vozilo);
        assertEquals(45,zaposlenik.getPrihod());

    }

    @Test
    void parkirajVozilo() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);
        Zaposlenik zaposlenik=new Zaposlenik("Marko","Maric",10);

        zaposlenik.ParkirajVozilo(vozilo);
        //auto 50kn
        assertEquals(5,zaposlenik.getPlaca());
    }
}