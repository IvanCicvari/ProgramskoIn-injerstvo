package hr.algebra.ivancicvaric.factory;

import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.vozila.*;

public  class VoziloFactory {
    public Vozilo getVozilo(String tipVozila, TipGoriva tipGoriva){
        if (tipVozila==null)
        {
            return null;
        }
        if (tipVozila.equalsIgnoreCase("AUTOMOBIL")){
            return new Automobil(tipGoriva);
        } else if (tipVozila.equalsIgnoreCase("KAMION")){
            return new Kamion(tipGoriva);
        }
        else if (tipVozila.equalsIgnoreCase("KOMBI")){
            return new Kombi(tipGoriva);
        }
        else if (tipVozila.equalsIgnoreCase("AUTOBUS")){
            return new Autobus(tipGoriva);
        }
        else {
            return null;
        }
    }
}
