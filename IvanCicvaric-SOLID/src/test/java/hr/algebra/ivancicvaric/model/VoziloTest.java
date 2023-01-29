package hr.algebra.ivancicvaric.model;

import hr.algebra.ivancicvaric.model.vozila.Automobil;
import hr.algebra.ivancicvaric.model.vozila.TipGoriva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoziloTest {

    @Test
    void getStanjeRezervoara() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);

     assertNotNull(vozilo.getStanjeRezervoara());
    }

    @org.junit.jupiter.api.Test
    void getTipGoriva() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);

        assertEquals(vozilo.getTipGoriva(),TipGoriva.STRUJA);
    }

    @org.junit.jupiter.api.Test
    void napuni() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);
            vozilo.Napuni();
        assertEquals(100,vozilo.getStanjeRezervoara());
    }

    @org.junit.jupiter.api.Test
    void trebaPunit() {
        Vozilo vozilo=new Automobil(TipGoriva.STRUJA);
        vozilo.setStanjeRezervoara(10);
        assertEquals(true,vozilo.TrebaPunit());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Vozilo vozilo=new Vozilo(TipGoriva.STRUJA);
        String expResult= "Vozilo{" +
                "stanjeRezervoara=" +vozilo.getStanjeRezervoara() +
                ", tipGoriva=" + vozilo.getTipGoriva() +
                '}';
        assertEquals(expResult,vozilo.toString());
    }
}