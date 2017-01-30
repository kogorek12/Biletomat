/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletomatikasownik;

import Uzytkownik.Karta;
import Uzytkownik.Osoba;
import java.util.Date;
import java.util.HashMap;
import pamiec.MonetyWPamieci;

public class UstawFabrycznie {
        public void ustawMonetyDoBiletomatu(){
            
        HashMap<Integer, Integer> monety = new HashMap();
        monety.put(500, 1000);
        monety.put(200, 100);
        monety.put(100, 100);
        monety.put(50, 100);
        monety.put(20, 100);
        monety.put(10, 100);
        
        MonetyWPamieci.zapisz(monety);
}
        
        public void ustawKarty(){
            long pesel1 = (long)94120201002.0;
            Osoba osoba1 = new Osoba("Jan","Kowalski", pesel1);
            Date dataOd1 = new Date();
            dataOd1.setTime(100);
            BiletNaKarcie biletkarta1 = new BiletNaKarcie(RodzajZnizki.Ulgowy, BiletKartaTyp.Tygodniowy, dataOd1);
            Karta karta1 = new Karta(osoba1, biletkarta1);
            
            long pesel2 = (long)94120201001.0;
            Osoba osoba2 = new Osoba("Marek","Dostojny", pesel2);
            Date dataOd2 = new Date(7770);
            dataOd2.setTime(100);
            BiletNaKarcie biletkarta2 = new BiletNaKarcie(RodzajZnizki.Normalny, BiletKartaTyp.Tygodniowy, dataOd2);
            Karta karta2 = new Karta(osoba2, biletkarta2);
            
            long pesel3 = (long)94120201001.0;
            Osoba osoba3 = new Osoba("Michal","Krajan", pesel3);
            Date dataOd3 = new Date();
            dataOd3.setTime(102130);
            BiletNaKarcie biletkarta3 = new BiletNaKarcie(RodzajZnizki.Normalny, BiletKartaTyp.Tygodniowy, dataOd2);
            Karta karta3 = new Karta(osoba3, biletkarta3);
        }
        public void ustawUzytkownikow(){
            long pesel1 = (long)94120201002.0;
            Osoba osoba1 = new Osoba("Jan","Kowalski", pesel1);
            
            long pesel2 = (long)94120201001.0;
            Osoba osoba2 = new Osoba("Marek","Dostojny", pesel2);
            
            long pesel3 = (long)94120201001.0;
            Osoba osoba3 = new Osoba("Michal","Krajan", pesel2);
        }
        
        
}