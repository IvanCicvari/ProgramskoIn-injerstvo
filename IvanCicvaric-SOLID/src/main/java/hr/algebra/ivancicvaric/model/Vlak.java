package hr.algebra.ivancicvaric.model;

import hr.algebra.ivancicvaric.model.vozila.Punjivo;

import java.util.ArrayList;
import java.util.List;

public abstract class Vlak {

    int kolicinaDostupnihMjesta;
    protected List<Vozilo>listaVozila;

    public Vlak(int kolicinaDostupnihMjesta){
        this.kolicinaDostupnihMjesta=kolicinaDostupnihMjesta;
        this.listaVozila=new ArrayList<>();
    }

    public abstract void DodajVozilo(Vozilo vozilo);

    @Override
    public String toString() {
        return "Vlak{" +
                "listaVozila=" + listaVozila +
                '}';
    }
}
