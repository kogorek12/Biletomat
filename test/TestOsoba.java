
import Uzytkownik.Osoba;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOsoba {

    @org.junit.Test
    public void isCreateOsoba() {
       
        System.out.println("=====START=====");
        System.out.println("Test sprawdza czy właściwie został utworzony obiekt typu Osoba.");
        //given
        String imie = "Jan";
        String nazwisko = "Kowal";
        long PESEL = (long) 92020204290.0;
        //when
        Osoba os = new Osoba(imie, nazwisko, PESEL);
        //then
        Assert.assertNotNull(os);
        Assert.assertEquals("Jan", os.getImie());
        Assert.assertEquals("Kowal", os.getNazwisko());
        Assert.assertEquals((long) 92020204290.0, os.getPESEL());
        
        System.out.println("Wartość oczekiwana: "+"Jan"+"   Wartość otrzymana: "+os.getImie());
        System.out.println("Wartość oczekiwana: "+"Kowal"+"     Wartość otrzymana: "+os.getNazwisko());
        System.out.println("Wartość oczekiwana: "+"92020204290"+"   Wartość otrzymana: "+os.getPESEL());
        System.out.println("====STOP====");
    }

}
