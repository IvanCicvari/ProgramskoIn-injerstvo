package hr.algebra.ivancicvaric.model.vlak;

import hr.algebra.ivancicvaric.model.Vlak;
import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.vozila.Automobil;
import hr.algebra.ivancicvaric.model.vozila.Kombi;

public class MaliVlak extends Vlak {

    private static final int KOLICINA_DOSTUPNIH_MJESTA =8 ;
    public MaliVlak() {
        super(KOLICINA_DOSTUPNIH_MJESTA);
    }

    @Override
    public void DodajVozilo(Vozilo vozilo) {
        if (super.listaVozila.size()<KOLICINA_DOSTUPNIH_MJESTA) {
            if (vozilo instanceof Automobil || vozilo instanceof Kombi) {
                super.listaVozila.add(vozilo);
            } else {
                System.out.println("NE PRIMAMO OVO VOZILO !");
            }
        }
    }


/*
    @Override
    public String toString() {
        long brojAutomobila=super.listaVozila.stream().filter(vozilo -> vozilo instanceof Automobil).count();
        long brojKombija=super.listaVozila.stream().filter(vozilo -> vozilo instanceof Kombi).count();
        return "Kolicina dostupnih vozila je: "+KOLICINA_DOSTUPNIH_MJESTA+" u vlaku se nalazi: "+brojAutomobila +" automobila i nalazi se: "+brojKombija +" kombija";
    }
    */
}
