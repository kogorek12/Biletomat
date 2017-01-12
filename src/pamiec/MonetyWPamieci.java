package pamiec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MonetyWPamieci {

    public static void zapisz(HashMap pieniadze) {
        File monety = new File("monety.txt");
        Set klucze = pieniadze.keySet();
        try {
            PrintWriter zapisz = new PrintWriter(monety);

            for (Object klucz : klucze) {
                zapisz.print(klucz + ":");
                zapisz.print(pieniadze.get(klucz));
                zapisz.println();
            }
            zapisz.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

    }

    public static HashMap wczytaj() {
        File monety = new File("monety.txt");
        HashMap<Double, Integer> pieniadze = new HashMap();
        double klucz;
        int ilosc;
        String linia;
        try {
            Scanner wczytaj = new Scanner(monety);

            while (wczytaj.hasNextLine()) {
                linia = wczytaj.nextLine();
                klucz = Double.parseDouble(linia.substring(0, 3));
                ilosc = Integer.parseInt(linia.substring(4));

                pieniadze.put(klucz, ilosc);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        return pieniadze;

    }
}
