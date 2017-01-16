/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

osoba-> trudniejsza do wczytania, MYŚL, gettery. LINIJKA POD LINIJKĄ- dane

 */
package pamiec;

import biletomatikasownik.BiletKartaTyp;
import Uzytkownik.Karta;
import Uzytkownik.Osoba;
import biletomatikasownik.RodzajZnizki;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class KartyWPamieci {
    public static void zapisz(HashMap<Integer, Karta> zbiorKart) {
        File karty = new File("karta.txt");
        Set klucze = zbiorKart.keySet();
        try {
            PrintWriter zapisz = new PrintWriter(karty);

            for (Object klucz : klucze) {
              zapisz.println(zbiorKart.get(klucz).getId());
              zapisz.println(zbiorKart.get(klucz).getZnizka());
              zapisz.println(zbiorKart.get(klucz).getTyp());
              }
            zapisz.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

    }

    public static HashMap wczytaj() {
        File karty = new File("karta.txt");
        HashMap<Integer, Karta> zbiorKart = new HashMap();
        int id;
        RodzajZnizki znizka;
        BiletKartaTyp typ;

        try {
            Scanner wczytaj = new Scanner(karty);
            HashMap<Integer,Osoba> osoby = new HashMap();
            osoby = UzytkownicyWPamieci.wczytaj();
            while (wczytaj.hasNextLine()) {
                id=wczytaj.nextInt();
                Osoba ludz = osoby.get(id);
                znizka= RodzajZnizki.valueOf(wczytaj.nextLine());
                typ=BiletKartaTyp.valueOf(wczytaj.nextLine());
                Karta karta = new Karta(id,ludz,znizka,typ);
                zbiorKart.put(id, karta);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        return zbiorKart;
    }
    
}
