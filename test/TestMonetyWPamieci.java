import Uzytkownik.Osoba;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pamiec.MonetyWPamieci;


public class TestMonetyWPamieci {
    
    
        @org.junit.Test
    public void isTheSameMonetaSavedAndLoaded() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza zgodność obiektu klasy Osoba przed i po zapisie do pliku");
        //given
        HashMap<Integer, Integer> monety = new HashMap();
        monety.put(20, 150);
        monety.put(10, 11);
        HashMap<Long, Osoba> wczytane_pieniadze = new HashMap();
        
        //when
        MonetyWPamieci.zapisz(monety);
        wczytane_pieniadze=MonetyWPamieci.wczytaj();
        //then
        Assert.assertNotNull(wczytane_pieniadze);
        Assert.assertEquals(monety,wczytane_pieniadze);
        System.out.println("====STOP====");

    }
 
    
    
    
}
