
import biletomatikasownik.BiletKartaTyp;
import biletomatikasownik.BiletNaKarcie;
import biletomatikasownik.RodzajZnizki;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBiletNaKarcie {

    @org.junit.Test
    public void czydodaczasMiesieczny() {
    System.out.println("=====START=====");
    System.out.println("Test prawidłowości dodania czasu 30 dni na Karcie");
    //given
    long dni30 = 2592000;
    RodzajZnizki znizka = RodzajZnizki.Normalny;
    BiletKartaTyp typ = BiletKartaTyp.Miesieczny;
    Date dataOd = new Date();
    Date dataDoOczekiwana = new Date();
    dataOd.setTime(100);
    dataDoOczekiwana.setTime(2592100);
    //when
    BiletNaKarcie bilecik = new BiletNaKarcie(znizka, typ, dataOd);
    //then
    //zadziała jeśli wykasuje 3 zera w klasie BiletNaKarcie
    Assert.assertEquals(dni30+dataOd.getTime(),bilecik.getDataDo().getTime());
    System.out.println("====STOP====");

    }
    
     @org.junit.Test
    public void czydodaczastygodniowy() {
        System.out.println("=====START=====");
        System.out.println("Test prawidłowości dodania czasu 7 dni na Karcie");
     //given
    long dni7 = 604800;
        RodzajZnizki znizka = RodzajZnizki.Normalny;
        BiletKartaTyp typ = BiletKartaTyp.Tygodniowy;
        Date dataOd = new Date();
        Date dataDoOczekiwana = new Date();
        dataOd.setTime(100);
        dataDoOczekiwana.setTime(604900);
    //when
        BiletNaKarcie bilecik = new BiletNaKarcie(znizka, typ, dataOd);
    //then
        Assert.assertEquals(dni7+dataOd.getTime(),bilecik.getDataDo().getTime());
        System.out.println("====STOP====");
    }
    
    @org.junit.Test
    public void czydodatrzymiesiace() {
        System.out.println("=====START=====");
        System.out.println("Test prawidłowości dodania czasu 90 dni na Karcie");
     //given
        long trzy_miesiace = 7776000;
        RodzajZnizki znizka = RodzajZnizki.Normalny;
        BiletKartaTyp typ = BiletKartaTyp.TrzyMiesieczny;
        Date dataOd = new Date();
        Date dataDoOczekiwana = new Date();
        dataOd.setTime(100);
        dataDoOczekiwana.setTime(7776100);
        //when
        BiletNaKarcie bilecik = new BiletNaKarcie(znizka, typ, dataOd);
        //then
        Assert.assertEquals(trzy_miesiace+dataOd.getTime(),bilecik.getDataDo().getTime());
        System.out.println("====STOP====");
        }

    @org.junit.Test
    public void czydzialajagetery() {
        System.out.println("=====START=====");
        System.out.println("Test getterów klasy BiletKartaTyp");
        //given
        RodzajZnizki znizka = RodzajZnizki.Normalny;
        BiletKartaTyp typ = BiletKartaTyp.TrzyMiesieczny;
        Date dataOd = new Date();
        Date dataDoOczekiwana = new Date();
        //when
        BiletNaKarcie bilecik = new BiletNaKarcie(znizka, typ, dataOd);
        //then
        Assert.assertEquals(znizka,bilecik.getZnizka());
        Assert.assertEquals(typ,bilecik.getTyp());
        System.out.println("====STOP====");
        }
    
}
