
import Uzytkownik.Osoba;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pamiec.UzytkownicyWPamieci;

public class TestKartyWPamieci {

    @org.junit.Test
    public void isTheSameUzytkownicyWPamieciSavedAndLoaded() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza czy obiekt klasy UzytkownicyWPamieci został w prawidłowy sposób "
                + "zapisany i wczytany");
        //given
        long Pesel = (long) 92020204290.0;
        Osoba os = new Osoba("Christian", "Schreier", Pesel);
        HashMap<Long, Osoba> uzytkownicyTest = new HashMap();
        uzytkownicyTest.put(os.getPESEL(), os);
        HashMap<Long, Osoba> odczytanaMapa = new HashMap();
        //when
        UzytkownicyWPamieci.zapisz(uzytkownicyTest);
        UzytkownicyWPamieci.wczytaj();
        //then
        Assert.assertNotNull(uzytkownicyTest);
        Assert.assertEquals("Christian", uzytkownicyTest.get(os.getPESEL()).getImie());
        Assert.assertEquals("Schreier", uzytkownicyTest.get(os.getPESEL()).getNazwisko());
        System.out.println("====STOP====");
    }

}
