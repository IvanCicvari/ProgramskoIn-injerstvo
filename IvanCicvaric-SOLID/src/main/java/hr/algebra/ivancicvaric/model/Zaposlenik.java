package hr.algebra.ivancicvaric.model;

import hr.algebra.ivancicvaric.model.vozila.Naplativo;

public class Zaposlenik {
    String ime;
    String prezime;
    double provizija;


    double placa;
    double prihod;

    public double getPlaca() {
        return placa;
    }

    public double getPrihod() {
        return prihod;
    }

    public Zaposlenik(String ime,String prezime,double provizija){
        this.ime=ime;
        this.prezime=prezime;
        this.provizija=provizija;
        this.placa=0;
        this.prihod=0;
    }


    public void ParkirajVozilo(Vozilo vozilo){
        if (vozilo.TrebaPunit())
        {
            vozilo.Napuni();
        }

        Naplativo cijena = (Naplativo)vozilo;
        placa +=provizija/100 *cijena.IzracunajCijenu();
        prihod += cijena.IzracunajCijenu()-(provizija/100 *cijena.IzracunajCijenu());
    }

    @Override
    public String toString() {
        return "Zaposlenik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", provizija=" + provizija +"%"+
                ", placa=" + placa +
                ", prihod=" + prihod +
                '}';
    }
}
