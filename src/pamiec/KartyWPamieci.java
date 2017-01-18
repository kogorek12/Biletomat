package pamiec;

import biletomatikasownik.BiletKartaTyp;
import Uzytkownik.Karta;
import Uzytkownik.Osoba;
import biletomatikasownik.BiletNaKarcie;
import biletomatikasownik.RodzajZnizki;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class KartyWPamieci {
    public static void zapisz(HashMap<Long, Karta> zbiorKart) {
        File karty = new File("karty.txt");
        Set klucze = zbiorKart.keySet();
        try {
            PrintWriter zapisz = new PrintWriter(karty);

            for (Object klucz : klucze) {
              zapisz.println(zbiorKart.get(klucz).getId());
              zapisz.println(zbiorKart.get(klucz).getBilet().getZnizka());
              zapisz.println(zbiorKart.get(klucz).getBilet().getTyp());
              zapisz.println(zbiorKart.get(klucz).getBilet().getDataOd().getTime());
              }
            zapisz.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

    }

    public static HashMap wczytaj() {
        File karty = new File("karty.txt");
        HashMap<Integer, Karta> zbiorKart = new HashMap();
        int id;
        RodzajZnizki znizka;
        BiletKartaTyp typ;
        BiletNaKarcie bilet;
        Date dataOd;
        Date dataDo;

        try {
            Scanner wczytaj = new Scanner(karty);
            HashMap<Integer,Osoba> osoby = new HashMap();
            osoby = UzytkownicyWPamieci.wczytaj();
            while (wczytaj.hasNextLine()) {
                id=wczytaj.nextInt();
                Osoba ludz = osoby.get(id);
                znizka= RodzajZnizki.valueOf(wczytaj.nextLine());
                typ=BiletKartaTyp.valueOf(wczytaj.nextLine());
                dataOd=new Date(Long.parseLong(wczytaj.nextLine()));
                bilet = new BiletNaKarcie(znizka, typ, dataOd);
                Karta karta = new Karta(ludz,bilet);
                zbiorKart.put(id, karta);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        return zbiorKart;
    }
    
}
