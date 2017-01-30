package biletomatikasownik;

import Interfejs_graficzny.Biletomat_frame;
import Uzytkownik.Karta;
import Uzytkownik.Osoba;
import java.util.Date;
import java.util.HashMap;
import pamiec.KartyWPamieci;
import pamiec.MonetyWPamieci;
import pamiec.UzytkownicyWPamieci;

public class BiletomatIKasownik {

    public static void main(String[] args) {
        
        UstawFabrycznie ustawianie_poczatkowe = new UstawFabrycznie();
        ustawianie_poczatkowe.ustawUzytkownikow();
        ustawianie_poczatkowe.ustawMonetyDoBiletomatu();
        ustawianie_poczatkowe.ustawKarty();

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
        
        
      
        
         */
        // ZarzadzaniePieniedzmi zarzadzaniePieniedzmi = new ZarzadzaniePieniedzmi(MonetyWPamieci.wczytaj());
        //MonetyWPamieci.zapisz(zarzadzaniePieniedzmi.wydawankoResztki(10, 1000));

        // MonetyWPamieci.zapisz(zarzadzaniePieniedzmi.przyjmowaniePieniedzy(500));
        
//        HashMap<Long, Osoba> uzytkownicy = UzytkownicyWPamieci.wczytaj();
//        HashMap<Long, Karta> karty = new HashMap();
//        Osoba uzytkownik = uzytkownicy.get(Long.parseLong("72040615261"));
//        BiletNaKarcie bilet = new BiletNaKarcie(RodzajZnizki.Normalny, BiletKartaTyp.Tygodniowy, new Date());
//        Karta karta = new Karta(uzytkownik, bilet);
//        karty.put(karta.getId(), karta);
//        System.out.println(karta.getBilet().getDataDo());
//        KartyWPamieci.zapisz(karty);

    }

}
