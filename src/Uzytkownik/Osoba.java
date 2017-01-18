package Uzytkownik;

public class Osoba {
    private String imie;
    private String nazwisko;
    private long PESEL;

    public Osoba(String imie, String nazwisko, long PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getPESEL() {
        return PESEL;
    }
    
    
}
