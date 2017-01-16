
package biletomatikasownik;

public class BiletPapierowy {
    private double cena;
    private RodzajZnizki typ;

    public BiletPapierowy(RodzajZnizki typ) {
        this.typ = typ;
        if(this.typ.equals(RodzajZnizki.Normalny))
            this.cena=3.3;
        else
            this.cena=1.8;
        }

    public double getCena() {
        return cena;
    }

    public RodzajZnizki getTyp() {
        return typ;
    }
    
    
  
      
    
    
    
}
