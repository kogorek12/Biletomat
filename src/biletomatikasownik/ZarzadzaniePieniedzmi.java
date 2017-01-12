package biletomatikasownik;

import java.util.HashMap;
import java.util.Set;
import pamiec.KartyWPamieci;
import pamiec.MonetyWPamieci;

public class ZarzadzaniePieniedzmi {
    
    public static boolean czyWydacReszte(double cenaBiletu, double wplaconaKwota){
        if(wplaconaKwota>cenaBiletu){
            return true;
        }
        else
            return false;
    }
    
    public static void wydawankoResztki(double cenaBiletu, double wplaconaKwota){
        if(ZarzadzaniePieniedzmi.czyWydacReszte(cenaBiletu, wplaconaKwota)){
            HashMap<Integer,Double> monety = MonetyWPamieci.wczytaj();
            double reszta=wplaconaKwota-cenaBiletu;
            double moneta;
            Set klucze = monety.keySet();
            while(reszta>0){
                    for(Object klucz : klucze) {
                                         
                    
                    }
            }
                
            
        
    }
    }
}
