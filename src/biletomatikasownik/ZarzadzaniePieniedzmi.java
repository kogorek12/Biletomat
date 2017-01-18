package biletomatikasownik;

import java.util.HashMap;
import java.util.Set;
import pamiec.MonetyWPamieci;

public class ZarzadzaniePieniedzmi {
    
    private HashMap<Integer, Integer> pieniadze;

    public ZarzadzaniePieniedzmi(HashMap<Integer, Integer> pieniadze) {
        this.pieniadze = pieniadze;
    }

    public HashMap<Integer, Integer> getPieniadze() {
        return pieniadze;
    }
    
    
    public boolean czyWydacReszte(int cenaBiletu, int wplaconaKwota) {
        if (wplaconaKwota > cenaBiletu) {
            return true;
        } else {
            return false;
        }
    }

    public int maximum(Set klucze){
    int max=0;
        for (Object klucz : klucze) {
            if((Integer)klucz>max)
                max=(Integer)klucz;
            }
        return max;
    }
    
    public boolean czyMogeWydacReszte(int reszta){
        boolean czyWydac = true;
        HashMap<Integer, Integer> monetyPom = new HashMap(this.pieniadze);
        int resztaPom = reszta;
        Set kluczePom = monetyPom.keySet();
        int monetaPom;
        int ilePom = 0;
        while (resztaPom >= 0 && !monetyPom.isEmpty()) {
                    monetaPom = maximum(kluczePom);
                    if (monetaPom <= resztaPom && monetyPom.get(monetaPom) != 0) {
                        resztaPom = resztaPom - monetaPom;
                        ilePom = monetyPom.get(monetaPom);
                        ilePom--;
                        monetyPom.replace(monetaPom, ilePom);
                    }else
                        kluczePom.remove(monetaPom);
        }
        if(resztaPom!=0)
            czyWydac=false;
        return czyWydac;
    }
    
    public HashMap<Integer, Integer> wydawankoResztki(int cenaBiletu, int wplaconaKwota) {
        HashMap<Integer, Integer> monetyPoWydaniu = new HashMap(this.pieniadze);
        int reszta = wplaconaKwota - cenaBiletu;
        if (czyWydacReszte(cenaBiletu, wplaconaKwota) && czyMogeWydacReszte(reszta)) {
            monetyPoWydaniu.clear();
            int moneta;
            int ile=0;
            Set klucze = this.pieniadze.keySet();
            while (reszta >= 0 && !this.pieniadze.isEmpty()) {
                    moneta = maximum(klucze);
                    if (moneta <= reszta && this.pieniadze.get(moneta) != 0) {
                        reszta = reszta - moneta;
                        System.out.println(reszta);
                        ile = this.pieniadze.get(moneta);
                        ile--;
                        this.pieniadze.replace(moneta, ile);
                    }else{
                        monetyPoWydaniu.put(moneta, this.pieniadze.get(moneta));
                        klucze.remove(moneta);
                    }
            }
        }
            return monetyPoWydaniu;
        
    }
    
    public HashMap<Integer, Integer> przyjmowaniePieniedzy (int moneta){
        HashMap<Integer, Integer> pieniazki = new HashMap(this.pieniadze);
        pieniazki.replace(moneta, pieniazki.get(moneta)+1);       
        return pieniazki;
    }
    
    
    
    
}
    

