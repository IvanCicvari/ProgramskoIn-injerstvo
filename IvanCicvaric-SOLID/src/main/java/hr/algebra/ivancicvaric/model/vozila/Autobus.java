package hr.algebra.ivancicvaric.model.vozila;

import hr.algebra.ivancicvaric.model.Vozilo;

public class Autobus extends Vozilo implements  Naplativo {


    public Autobus(TipGoriva tipGoriva) {
        super(tipGoriva);

    }

    @Override
    public double IzracunajCijenu() {
        return 70.00;
    }


    @Override
    public String toString() {
        return "Autobus{" +
                    "Cijena: " + IzracunajCijenu() + "kuna"+",stanje rezervoara: "+ getStanjeRezervoara() +"%"+
                '}';
    }
}
