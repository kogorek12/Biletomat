package Uzytkownik;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int PESEL;

    public Osoba(String imie, String nazwisko, int PESEL) {
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

    public int getPESEL() {
        return PESEL;
    }
    
    
}
