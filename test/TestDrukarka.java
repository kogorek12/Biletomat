import biletomatikasownik.Drukarka;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDrukarka {
    
     @org.junit.Test
    public void createDrukarka(){
        System.out.println("=====START=====");
        System.out.println("Test sprawdza prawidłowość konstruktora klasy Drukarka oraz jego getterów");
        //given
        boolean tusz = false;
        boolean papier = true;
        //when
        Drukarka hp = new Drukarka(tusz,papier);
        //then
        Assert.assertEquals(papier,hp.isPapier());
        Assert.assertEquals(tusz,hp.isTusz());
        
        System.out.println("====STOP====");
        
    
    
}
}