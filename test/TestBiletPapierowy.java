import biletomatikasownik.BiletPapierowy;
import biletomatikasownik.RodzajZnizki;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestBiletPapierowy {
    
     @org.junit.Test
    public void ceny(){
        System.out.println("=====START=====");
        System.out.println("Test sprawdza prawidłowość konstruktora klasy BiletPapierowy oraz zwracanych "
                + " przez niego wartości");
        //given
        int cenaUlgowy = 180;
        int cenaNormalny = 330;
        //when
        BiletPapierowy biletUlgowy = new BiletPapierowy(RodzajZnizki.Ulgowy);
        BiletPapierowy biletNormalny = new BiletPapierowy(RodzajZnizki.Normalny);
        //then
        Assert.assertEquals(cenaUlgowy,(int)biletUlgowy.getCena());
        Assert.assertEquals(cenaNormalny,(int)biletNormalny.getCena());
        
        System.out.println("====STOP====");
    }
    
    
    
}
