package hr.algebra.ivancicvaric.model.vozila;

import hr.algebra.ivancicvaric.model.Vozilo;

public class Kombi extends Vozilo implements  Naplativo{

    public Kombi(TipGoriva tipGoriva) {
        super(tipGoriva);
    }

    @Override
    public double IzracunajCijenu() {
        return 80.00;
    }
    @Override
    public String toString() {
        return "Kombi{" +
                "Cijena: " + IzracunajCijenu() + "kuna"+ ", stanje rezervoara:"+ getStanjeRezervoara()+"%"+
                '}';
    }
}
