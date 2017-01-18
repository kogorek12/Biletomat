
package biletomatikasownik;


import Interfejs_graficzny.Biletomat_frame;
import Uzytkownik.Karta;
import java.util.Date;
import java.util.HashMap;
import pamiec.KartyWPamieci;
import pamiec.MonetyWPamieci;

public class BiletomatIKasownik {

    public static void main(String[] args) {
        

        new Biletomat_frame(Biletomat_frame.NAZWA_FRAME);

        HashMap<Integer, Integer> monety = new HashMap();
        monety.put(500, 1000);
        monety.put(200, 100);
        monety.put(100, 100);
        monety.put(50, 100);
        monety.put(20, 100);
        monety.put(10, 100);
       
        MonetyWPamieci.zapisz(monety);
         /*
    monety= MonetyWPamieci.wczytaj();
        
       // HashMap<Integer, Karta> dane = new HashMap();
       // KartyWPamieci.zapisz(dane);
        
        
     //   dane = KartyWPamieci.wczytaj();
        
        
        // TESTY DO KARTY W PAMIECI I UZYTKOWNICY W PAMIECI
        
       */ 
      // ZarzadzaniePieniedzmi zarzadzaniePieniedzmi = new ZarzadzaniePieniedzmi(MonetyWPamieci.wczytaj());
       //MonetyWPamieci.zapisz(zarzadzaniePieniedzmi.wydawankoResztki(10, 1000));
       
      
     // MonetyWPamieci.zapisz(zarzadzaniePieniedzmi.przyjmowaniePieniedzy(500));
      
      
    }
    
}
