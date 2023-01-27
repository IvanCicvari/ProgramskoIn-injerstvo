package hr.algebra.ivancicvaric.model.vlak;

import hr.algebra.ivancicvaric.model.Vlak;
import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.vozila.Autobus;
import hr.algebra.ivancicvaric.model.vozila.Automobil;
import hr.algebra.ivancicvaric.model.vozila.Kamion;
import hr.algebra.ivancicvaric.model.vozila.Kombi;

public class VelikiVlak extends Vlak {
    private static final int KOLICINA_DOSTUPNIH_MJESTA =6 ;


    public VelikiVlak() {
        super(KOLICINA_DOSTUPNIH_MJESTA);
    }

    @Override
    public void DodajVozilo(Vozilo vozilo) {
        if (super.listaVozila.size()<KOLICINA_DOSTUPNIH_MJESTA) {
            if (vozilo instanceof Kamion || vozilo instanceof Autobus) {
                super.listaVozila.add(vozilo);
            } else {
                System.out.println("NE PRIMAMO OVO VOZILO !");
            }
        }
    }
/*
    long brojKamiona=super.listaVozila.stream().filter(vozilo -> vozilo instanceof Kamion).count();
    long brojAutobusa=super.listaVozila.stream().filter(vozilo -> vozilo instanceof Autobus).count();



    @Override
    public String toString() {

        return "Kolicina dostupnih vozila je: "+KOLICINA_DOSTUPNIH_MJESTA+" u vlaku se nalazi: "+brojKamiona +" kamiona i nalazi se: "+brojAutobusa +" autobusa";
    }
    */


}
