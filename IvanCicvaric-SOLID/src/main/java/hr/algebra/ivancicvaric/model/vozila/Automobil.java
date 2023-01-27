package hr.algebra.ivancicvaric.model.vozila;

import hr.algebra.ivancicvaric.model.Vozilo;

public class Automobil extends Vozilo implements  Naplativo{
    public Automobil(TipGoriva tipGoriva) {
        super(tipGoriva);
    }

    @Override
    public double IzracunajCijenu() {
        return 50.00;
    }
    @Override
    public String toString() {
        return "Automobil{" +
                "Cijena: " + IzracunajCijenu() + "kuna"+ ", stanje rezervoara:"+ getStanjeRezervoara()+"%"+
                '}';
    }
}

