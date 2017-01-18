
package biletomatikasownik;

public class BiletPapierowy {
    private int cena;
    private RodzajZnizki typ;

    public BiletPapierowy(RodzajZnizki typ) {
        this.typ = typ;
        if(this.typ.equals(RodzajZnizki.Normalny))
            this.cena=330;
        else
            this.cena=180;
        }

    public double getCena() {
        return cena;
    }

    public RodzajZnizki getTyp() {
        return typ;
    }
    
    
  
      
    
    
    
}
