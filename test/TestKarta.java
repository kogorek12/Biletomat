import Uzytkownik.Karta;
import Uzytkownik.Osoba;
import biletomatikasownik.BiletKartaTyp;
import biletomatikasownik.BiletNaKarcie;
import biletomatikasownik.RodzajZnizki;
import java.util.Date;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestKarta {
    
    @org.junit.Test
    public void isCreateKarta(){
        System.out.println("=====START=====");
        System.out.println("Test sprawdza prawidłowość konstruktora klasy Karta oraz jego getterów");
        //given
        long id = 1;
        Date dataOd = new Date();
        dataOd.setTime(100);
        Osoba sylwester = new Osoba("Sylwester","Bolibrzuch",id);
        BiletNaKarcie bilet_na_karcie = new BiletNaKarcie(RodzajZnizki.Ulgowy, BiletKartaTyp.Tygodniowy, dataOd);
        //when
        Karta karta = new Karta(sylwester, bilet_na_karcie);
        //then
        Assert.assertEquals(sylwester,karta.getOsoba());
        Assert.assertEquals(bilet_na_karcie, karta.getBilet());
        Assert.assertEquals(id, karta.getId());
        System.out.println("====STOP====");
        
        
    }
    
    
}
