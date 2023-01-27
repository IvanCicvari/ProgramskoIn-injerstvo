package hr.algebra.ivancicvaric;

import hr.algebra.ivancicvaric.model.Vlak;
import hr.algebra.ivancicvaric.model.Vozilo;
import hr.algebra.ivancicvaric.model.Zaposlenik;
import hr.algebra.ivancicvaric.model.vlak.MaliVlak;
import hr.algebra.ivancicvaric.model.vlak.VelikiVlak;
import hr.algebra.ivancicvaric.model.vozila.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Solid  {


    public static void main(String[] args) {

    VoziloFactory voziloFactory=new VoziloFactory();

        Vlak maliVlak=new MaliVlak();
        Vlak velikiVlak= new VelikiVlak();
        Zaposlenik zaposlenik1=new Zaposlenik("Pero","Peric",10);
        Zaposlenik zaposlenik2 =new Zaposlenik("Ivica","Ivioc",11);

        Vozilo automobil=new Automobil(TipGoriva.PLIN);
        Vozilo kombi=new Kombi(TipGoriva.PLIN);
        Vozilo autobus =new Autobus(TipGoriva.STRUJA);
        Vozilo kamion=new Kamion(TipGoriva.STRUJA);

        Vozilo tvornickiAutomobil=voziloFactory.getVozilo("automobil",TipGoriva.STRUJA);
        Vozilo tvornickiKamion=voziloFactory.getVozilo("Kamion",TipGoriva.PLIN);
        Vozilo tvornickiAutobus=voziloFactory.getVozilo("Autobus",TipGoriva.PLIN);
        Vozilo tvornickiKombi=voziloFactory.getVozilo("Kombi",TipGoriva.STRUJA);




        zaposlenik1.ParkirajVozilo(autobus);
        velikiVlak.DodajVozilo(autobus);
        zaposlenik2.ParkirajVozilo(kamion);
        velikiVlak.DodajVozilo(kamion);
        System.out.println(velikiVlak);

        zaposlenik2.ParkirajVozilo(automobil);
        maliVlak.DodajVozilo(automobil);
        zaposlenik1.ParkirajVozilo(kombi);
        maliVlak.DodajVozilo(kombi);
        System.out.println(maliVlak);

        //factory
        zaposlenik1.ParkirajVozilo(tvornickiAutobus);
        velikiVlak.DodajVozilo(tvornickiAutobus);
        zaposlenik2.ParkirajVozilo(tvornickiKamion);
        velikiVlak.DodajVozilo(tvornickiKamion);
        System.out.println(velikiVlak);

        zaposlenik2.ParkirajVozilo(tvornickiAutomobil);
        maliVlak.DodajVozilo(tvornickiAutomobil);
        zaposlenik1.ParkirajVozilo(tvornickiKombi);
        maliVlak.DodajVozilo(tvornickiKombi);
        System.out.println(maliVlak);

        System.out.println(zaposlenik1);
        System.out.println(zaposlenik2);
    }


}
