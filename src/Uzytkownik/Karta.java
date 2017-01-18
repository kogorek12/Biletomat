
package Uzytkownik;

import biletomatikasownik.BiletNaKarcie;

public class Karta {
    private long id;
    private Osoba osoba;
    private BiletNaKarcie bilet;
   
   

    public Karta(Osoba osoba,BiletNaKarcie bilet ) {
        this.id = osoba.getPESEL();
        this.osoba = osoba;
        this.bilet = bilet;
    }

    public long getId() {
        return id;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public BiletNaKarcie getBilet() {
        return bilet;
    }

   
    
    
}
