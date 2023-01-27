package hr.algebra.ivancicvaric.model.vozila;

import hr.algebra.ivancicvaric.model.Vozilo;

public class Kamion extends Vozilo implements  Naplativo{
    public Kamion(TipGoriva tipGoriva) {
        super(tipGoriva);
    }

    @Override
    public double IzracunajCijenu() {
        return 90.00;
    }
    @Override
    public String toString() {
        return "Kamion{" +
                "Cijena: " + IzracunajCijenu() + "kuna"+ ", stanje rezervoara:"+ getStanjeRezervoara()+"%"+
                '}';
    }
}
