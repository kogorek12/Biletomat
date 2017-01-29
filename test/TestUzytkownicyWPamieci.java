/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Uzytkownik.Osoba;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pamiec.UzytkownicyWPamieci;

/**
 *
 * @author Michael
 */
public class TestUzytkownicyWPamieci {

    @org.junit.Test
    public void isTheSameOsobaSavedAndLoaded() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza zgodność obiektu klasy Uzytkownik przed i po zapisie do pliku...");
        //given
        long Pesel = (long) 92020204290.0;
        Osoba os = new Osoba("Christian", "Schreier", Pesel);
        HashMap<Long, Osoba> uzytkownicyTest = new HashMap();
        uzytkownicyTest.put(os.getPESEL(), os);
        HashMap<Long, Osoba> odczytanaMapa = new HashMap();
        //when
        UzytkownicyWPamieci.zapisz(uzytkownicyTest);
        odczytanaMapa = UzytkownicyWPamieci.wczytaj();
        //then
        Assert.assertNotNull(odczytanaMapa);
        Assert.assertEquals(uzytkownicyTest.keySet(), odczytanaMapa.keySet());
        Assert.assertEquals(uzytkownicyTest.getClass(), odczytanaMapa.getClass());
        Assert.assertEquals("Christian", odczytanaMapa.get(os.getPESEL()).getImie());
        Assert.assertEquals("Schreier", odczytanaMapa.get(os.getPESEL()).getNazwisko());
        Assert.assertEquals(Pesel, odczytanaMapa.get(os.getPESEL()).getPESEL());
        
        System.out.println("Użytkownik poprawnie zapisany do pliku");
        System.out.println("====STOP====");
    }
}
