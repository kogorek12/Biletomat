
package Uzytkownik;

public class Karta {
    private int id;
    private Osoba osoba;
    private RodzajZnizki znizka;
    private BiletKartaTyp typ;

    public Karta(int id, Osoba osoba, RodzajZnizki znizka, BiletKartaTyp typ) {
        this.id = id;
        this.osoba = osoba;
        this.znizka = znizka;
        this.typ = typ;
    }

    public int getId() {
        return id;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public RodzajZnizki getZnizka() {
        return znizka;
    }

    public BiletKartaTyp getTyp() {
        return typ;
    }
    
    
    
    
}
