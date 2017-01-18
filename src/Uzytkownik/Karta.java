
package Uzytkownik;

import biletomatikasownik.BiletKartaTyp;
import biletomatikasownik.BiletNaKarcie;
import biletomatikasownik.RodzajZnizki;

public class Karta {
    private int id;
    private Osoba osoba;
    private BiletNaKarcie bilet;
   
   

    public Karta(Osoba osoba,BiletNaKarcie bilet ) {
        this.id = osoba.getPESEL();
        this.osoba = osoba;
        this.bilet = bilet;
    }

    public int getId() {
        return id;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public BiletNaKarcie getBilet() {
        return bilet;
    }

   
    
    
}
