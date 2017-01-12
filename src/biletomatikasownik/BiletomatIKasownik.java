
package biletomatikasownik;


import Interfejs_graficzny.Biletomat_frame;
import java.util.HashMap;
import pamiec.MonetyWPamieci;

public class BiletomatIKasownik {

    public static void main(String[] args) {
        

        new Biletomat_frame(Biletomat_frame.NAZWA_FRAME);

        HashMap<Double, Integer> monety = new HashMap();
       /* monety.put(5.0, 15);
        monety.put(2.0, 15);
        monety.put(1.0, 125);
        monety.put(0.5, 215);
        monety.put(0.2, 15);
        monety.put(0.1, 135);
        
        LaczenieZPlikami.zapisz(monety);
       */
        
        monety= MonetyWPamieci.wczytaj();
        System.out.println(monety.get(0.5));
        
        // TESTY DO KARTY W PAMIECI I UZYTKOWNICY W PAMIECI
        
        
        
        
        
       

       
    }
    
}
