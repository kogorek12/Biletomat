
package pamiec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LaczenieZPlikami {
    public static void zapisz(HashMap pieniadze){
        File monety = new File("monety.txt");
        Set klucze = pieniadze.keySet();
        try {
            PrintWriter zapisz = new PrintWriter(monety);
            
            for(Object klucz:klucze){
                zapisz.print(klucz+":");
                zapisz.print(pieniadze.get(klucz));
                zapisz.println();
            }
            zapisz.close();
        } catch (FileNotFoundException ex) {
           ex.getMessage();
        }
            
             
    }
    public static void wczytaj(){
        File monety = new File("monety.txt");
        try {
            Scanner wczytaj = new Scanner(monety);
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
      
        
    }
}
