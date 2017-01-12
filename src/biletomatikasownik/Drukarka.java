
package biletomatikasownik;

public class Drukarka {
    private boolean tusz;
    private boolean papier;

    public Drukarka(boolean tusz, boolean papier) {
        this.tusz = tusz;
        this.papier = papier;
    }

    public boolean isTusz() {
        return tusz;
    }

    public boolean isPapier() {
        return papier;
    }
    
    
}
