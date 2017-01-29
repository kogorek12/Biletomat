
import biletomatikasownik.ZarzadzaniePieniedzmi;
import java.util.HashMap;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class TestZarzadzaniePieniedzmi {

    @org.junit.Test
    public void is_Create_Zarzadzanie_Pieniedzmi() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza czy poprawnie został utworzony obiekt klasy ZarzadzaniePieniedzmi oraz czy poprawnie działają gettery");
        
        //given
        int nominal = 100;
        int sztuki = 4;
        HashMap<Integer, Integer> pieniazki = new HashMap();
        pieniazki.put(nominal, sztuki);
        //when
        ZarzadzaniePieniedzmi kasa = new ZarzadzaniePieniedzmi(pieniazki);
        //then
        Assert.assertEquals(pieniazki, kasa.getPieniadze());
        System.out.println("Oczekiwana: "+pieniazki+ " Uzyskana: "+kasa.getPieniadze());
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void give_Back_Rest() {
        System.out.println("=====START=====");
        System.out.println("Test metody czyWydacReszte, dla wartości gdzie powinien wydać");
        //given
        
        int cenaBiletu = 180;
        int ilosc1 = 500;
        int ilosc2 = 200;
        int ilosc3 = 190;
        HashMap<Integer, Integer> pieniazki = new HashMap();
        ZarzadzaniePieniedzmi kasa = new ZarzadzaniePieniedzmi(pieniazki);
        //when
        boolean czy_wydac1 = kasa.czyWydacReszte(cenaBiletu, ilosc1);
        boolean czy_wydac2 = kasa.czyWydacReszte(cenaBiletu, ilosc2);
        boolean czy_wydac3 = kasa.czyWydacReszte(cenaBiletu, ilosc3);
        //then
        Assert.assertTrue(czy_wydac1);
        Assert.assertTrue(czy_wydac2);
        Assert.assertTrue(czy_wydac3);
        
       
        System.out.println("wyniki czy wydac reszte: "+ czy_wydac1 + " "+ czy_wydac2+" "+ czy_wydac3);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void not_Give_Back_Rest() {
        System.out.println("=====START=====");
        System.out.println("Test metody czyWydacReszte, dla wartości gdzie nie powinien wydać");
        //given
        
        int cenaBiletu = 330;
        int ilosc_pieniedzy1 = 100;
        int ilosc_pieniedzy2 = 330;
        int ilosc_pieniedzy3 = 320;
        HashMap<Integer, Integer> pieniazki = new HashMap();
        ZarzadzaniePieniedzmi kasa = new ZarzadzaniePieniedzmi(pieniazki);
        //when
        boolean czy_wydac1 = kasa.czyWydacReszte(cenaBiletu, ilosc_pieniedzy1);
        boolean czy_wydac2 = kasa.czyWydacReszte(cenaBiletu, ilosc_pieniedzy2);
        boolean czy_wydac3 = kasa.czyWydacReszte(cenaBiletu, ilosc_pieniedzy3);
        //then
        Assert.assertFalse(czy_wydac1);
        Assert.assertFalse(czy_wydac2);
        Assert.assertFalse(czy_wydac3);
       
        System.out.println("Oczekiwane : " +false+" " +false+" " +false +" Otrzymane: "+ czy_wydac1+" "+ czy_wydac1+ " "+czy_wydac1);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void which_Key_Is_Maximum() {
        System.out.println("=====START=====");
        System.out.println(" Test sprawdzający który klucz mapy (wartość monety) jest największa");
        //given
        
        HashMap<Integer, Integer> zbior = new HashMap();
        zbior.put(100, 5);
        zbior.put(50, 12);
        zbior.put(20, 19);
        Set<Integer> klucze = zbior.keySet();
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(zbior);
        //when
        int max = z.maximum(klucze);
        //then
        Assert.assertNotNull(max);
        Assert.assertEquals(100, max);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void is_True_May_Give_Back_Rest() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza, czy automat może wydać resztę z posiadanych monet, wyniki powinny być poprawne");
        //given
        
        HashMap<Integer, Integer> posiadane_monety = new HashMap();
        posiadane_monety.put(100, 5);
        posiadane_monety.put(50, 12);
        posiadane_monety.put(20, 19);
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(posiadane_monety);
        //when
        boolean czy_moze_wydac1 = z.czyMogeWydacReszte(500);
        boolean czy_moze_wydac2 = z.czyMogeWydacReszte(20);
        boolean czy_moze_wydac3 = z.czyMogeWydacReszte(190);
        //then
        Assert.assertTrue(czy_moze_wydac1);
        Assert.assertTrue(czy_moze_wydac2);
        Assert.assertTrue(czy_moze_wydac3);
        System.out.println("====STOP====");

    }

    @org.junit.Test
    public void is_False_May_Give_Back_Rest() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza, czy automat może wydać resztę z posiadanych monet, wyniki powinny być niepoprawne");
        System.out.println("dodatkowo testowane jest czy bedzie wydawac pieniadze ktorych nie ma");
        //given
        
        HashMap<Integer, Integer> posiadane_monety = new HashMap();
        posiadane_monety.put(100, 5);
        posiadane_monety.put(50, 12);
        posiadane_monety.put(20, 19);
        posiadane_monety.put(10, 0);
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(posiadane_monety);
        int reszta1 = 10;
        int reszta2 = 30;
        int reszta3 = 19000;
        //when
        boolean czy_moze_wydac1 = z.czyMogeWydacReszte(reszta1);
        boolean czy_moze_wydac2 = z.czyMogeWydacReszte(reszta2);
        boolean czy_moze_wydac3 = z.czyMogeWydacReszte(reszta3);
        //then
        Assert.assertFalse( czy_moze_wydac1);
        Assert.assertFalse(czy_moze_wydac2);
        Assert.assertFalse(czy_moze_wydac3);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void givingBackRest() {
        System.out.println("=====START=====");
        System.out.println("Test porównuje zawartość monet przed i po użyciu metody wydawankoResztki,"
                + " jest wykonywany dla jednego rodzaju monet");
        //given
        
        HashMap<Integer, Integer> monetyPoWydaniu = new HashMap();
        HashMap<Integer, Integer> monetyWBiletomacie = new HashMap();
        HashMap<Integer, Integer> oczekiwana = new HashMap();
        monetyWBiletomacie.put(20, 12);
        oczekiwana.put(20, 11);
        int wplaconaKwota = 200;
        int cenaBiletu = 180;
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(monetyWBiletomacie);
        //when
        monetyPoWydaniu = z.wydawankoResztki(cenaBiletu, wplaconaKwota);
        //then
        Assert.assertEquals(oczekiwana, monetyPoWydaniu);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void givingBackRestTwoVariables() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza czy reszta zostanie wydana w sposób prawidłowy, dla dwoch wartosci monet");
        //given
        HashMap<Integer, Integer> monetyPoWydaniu = new HashMap();
        HashMap<Integer, Integer> monetyWBiletomacie = new HashMap();
        HashMap<Integer, Integer> oczekiwana = new HashMap();
        monetyWBiletomacie.put(20, 12);
        monetyWBiletomacie.put(10, 10);
        oczekiwana.put(20, 11);
        oczekiwana.put(10, 9);
        int wplaconaKwota = 200;
        int cenaBiletu = 170;
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(monetyWBiletomacie);
        //when
        monetyPoWydaniu = z.wydawankoResztki(cenaBiletu, wplaconaKwota);
        //then
        Assert.assertEquals(oczekiwana, monetyPoWydaniu);
        System.out.println("====STOP====");
    }
    
        @org.junit.Test
    public void givingBackRestMoreVariables() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza czy reszta zostanie wydana w sposób prawidłowy, dla różnych wartości monet"
                + "od wartości monet najwiekszej do najmniejszej");
        //given
        HashMap<Integer, Integer> monetyPoWydaniu = new HashMap();
        HashMap<Integer, Integer> monetyWBiletomacie = new HashMap();
        HashMap<Integer, Integer> oczekiwana = new HashMap();
        monetyWBiletomacie.put(20, 10);
        monetyWBiletomacie.put(10, 10);
        monetyWBiletomacie.put(50, 10);
        oczekiwana.put(20, 9);
        oczekiwana.put(10, 9);
        oczekiwana.put(50, 4);
        int wplaconaKwota = 500;
        int cenaBiletu = 170;
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(monetyWBiletomacie);
        //when
        monetyPoWydaniu = z.wydawankoResztki(cenaBiletu, wplaconaKwota);
        //then
        Assert.assertEquals(oczekiwana, monetyPoWydaniu);
        System.out.println("====STOP====");
    }
    

    @org.junit.Test
    public void acceptingCoins() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdzający czy w prawidłowy sposób przyjmowane są monety, jednego rodzaju");
        //given
        int moneta = 20;
        HashMap<Integer, Integer> oczekiwane = new HashMap();
        oczekiwane.put(20, 10);
        HashMap<Integer, Integer> pieniadzeWBiletomacie = new HashMap();
        pieniadzeWBiletomacie.put(20, 5);
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(pieniadzeWBiletomacie);
        //when
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        //then
        Assert.assertEquals(oczekiwane, pieniadzeWBiletomacie);
        System.out.println("====STOP====");
    }

    @org.junit.Test
    public void acceptingCoinsMoreVariables() {
        System.out.println("=====START=====");
        System.out.println("Test sprawdza, czy w prawidłowy sposób zapisywane są przyjmowane monety");
        //given
        int moneta = 20;
        int moneta50 = 50;
        HashMap<Integer, Integer> oczekiwane = new HashMap();
        oczekiwane.put(20, 10);
        oczekiwane.put(moneta50, 1);
        HashMap<Integer, Integer> pieniadzeWBiletomacie = new HashMap();
        pieniadzeWBiletomacie.put(20, 5);
        pieniadzeWBiletomacie.put(50, 0);
        ZarzadzaniePieniedzmi z = new ZarzadzaniePieniedzmi(pieniadzeWBiletomacie);
        //when
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta, z.przyjmowaniePieniedzy(moneta).get(moneta));
        pieniadzeWBiletomacie.replace(moneta50, z.przyjmowaniePieniedzy(moneta50).get(moneta50));
        //then
        Assert.assertEquals(oczekiwane, pieniadzeWBiletomacie);
        System.out.println("====STOP====");
    }

}
