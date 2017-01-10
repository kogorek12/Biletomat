
package biletomatikasownik;

import java.util.HashMap;
import pamiec.LaczenieZPlikami;

public class BiletomatIKasownik {

    public static void main(String[] args) {
        
        HashMap<Double, Integer> monety = new HashMap();
        monety.put(5.0, 15);
        monety.put(2.0, 15);
        monety.put(1.0, 125);
        monety.put(0.5, 215);
        monety.put(0.2, 15);
        monety.put(0.1, 135);
        
        LaczenieZPlikami.zapisz(monety);
       
    }
    
}
