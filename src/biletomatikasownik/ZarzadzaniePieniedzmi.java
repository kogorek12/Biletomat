package biletomatikasownik;

import java.util.HashMap;
import java.util.Set;
import pamiec.MonetyWPamieci;

public class ZarzadzaniePieniedzmi {

    public static boolean czyWydacReszte(double cenaBiletu, double wplaconaKwota) {
        if (wplaconaKwota > cenaBiletu) {
            return true;
        } else {
            return false;
        }
    }

    public static double maximum(Set klucze){
    double max=0;
        for (Object klucz : klucze) {
            if((Double)klucz>max)
                max=(Double)klucz;
            }
        return max;
    }
    
    public static void wydawankoResztki(double cenaBiletu, double wplaconaKwota) {
        if (ZarzadzaniePieniedzmi.czyWydacReszte(cenaBiletu, wplaconaKwota)) {
            HashMap<Double, Integer> monety = MonetyWPamieci.wczytaj();
            HashMap<Double, Integer> monetyPoWydaniu = new HashMap();
            double reszta = wplaconaKwota - cenaBiletu;
            double moneta;
            int ile=0;
            Set klucze = monety.keySet();
            while (reszta >= 0 && !monety.isEmpty()) {
                    moneta = maximum(klucze);
                    if (moneta <= reszta && monety.get(moneta) != 0) {
                        reszta = Math.round((reszta - moneta)*10)/10.0d;
                        ile = monety.remove(moneta);
                        ile--;
                        monetyPoWydaniu.put(moneta, ile);
                    }else{
                        monetyPoWydaniu.put(moneta, monety.get(moneta));
                        klucze.remove(moneta);
                    }
            }
            
            MonetyWPamieci.zapisz(monetyPoWydaniu);
        }
    }
}
