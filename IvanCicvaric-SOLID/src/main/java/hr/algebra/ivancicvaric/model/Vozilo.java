package hr.algebra.ivancicvaric.model;

import hr.algebra.ivancicvaric.model.vozila.Punjivo;
import hr.algebra.ivancicvaric.model.vozila.TipGoriva;

public class Vozilo implements Punjivo {
    private double stanjeRezervoara;
    private TipGoriva tipGoriva;

    public double getStanjeRezervoara() {
        return stanjeRezervoara;
    }

    public TipGoriva getTipGoriva() {
        return tipGoriva;
    }

    public Vozilo(TipGoriva tipGoriva ){
        this.tipGoriva=tipGoriva;
        this.stanjeRezervoara=Math.round((Math.random()*100+1)*100.0)/100.0;

    }

    @Override
    public void Napuni() {
        stanjeRezervoara=100;
    }

    @Override
    public boolean TrebaPunit() {
        if (tipGoriva == TipGoriva.PLIN)
        {
            return stanjeRezervoara<=10;
        } else if (tipGoriva ==  TipGoriva.STRUJA) {
            return  stanjeRezervoara<=11;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "stanjeRezervoara=" + stanjeRezervoara +
                ", tipGoriva=" + tipGoriva +
                '}';
    }
}
