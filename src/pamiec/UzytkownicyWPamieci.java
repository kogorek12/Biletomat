package pamiec;

import Uzytkownik.Osoba;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class UzytkownicyWPamieci {
    
    public static void zapisz(HashMap<Integer, Osoba> uzytkownicy) {
        File osoby = new File("osoby.txt");
        Set klucze = uzytkownicy.keySet();
        try {
            PrintWriter zapisz = new PrintWriter(osoby);

            for (Object klucz : klucze) {
                zapisz.println(uzytkownicy.get(klucz).getImie());
                zapisz.println(uzytkownicy.get(klucz).getNazwisko());
                zapisz.println(uzytkownicy.get(klucz).getPESEL());
           
            }
            zapisz.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

    }

    public static HashMap wczytaj() {
        
        File osoby = new File("osoby.txt");
        HashMap<Integer, Osoba> uzytkownicy = new HashMap();
        String imie;
        String nazwisko;
        int pesel;
        try {
            Scanner wczytaj = new Scanner(osoby);

            while (wczytaj.hasNextLine()) {
                imie=wczytaj.nextLine();
                nazwisko=wczytaj.nextLine();
                pesel=wczytaj.nextInt();
                
                Osoba ludz= new Osoba(imie, nazwisko, pesel);
                uzytkownicy.put(pesel, ludz);
            }
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        return uzytkownicy;

    }
    
}
