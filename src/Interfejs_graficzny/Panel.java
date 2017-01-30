package Interfejs_graficzny;

import biletomatikasownik.UstawFabrycznie;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.PrintWriter;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {

    public static final int SZEROKOSC = 900;
    public static final int WYSOKOSC = 600;

    public Panel() {
        super();
        wlasciwosciEkranuStartowego();
    }

    public void wlasciwosciEkranuStartowego() {
        PanelZLinia linia = new PanelZLinia();
        this.add(linia);
        linia.setVisible(true);
        Dimension wielkosc = linia.getPreferredSize();
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        this.setLayout(null);
        PrzyciskiDoAktualizacjiPanelu kupBilet = new PrzyciskiDoAktualizacjiPanelu("KUP BILET", this);
        kupBilet.setBounds(100, 90, 250, 150);
        this.add(kupBilet);
        PrzyciskiDoAktualizacjiPanelu doladujKarte = new PrzyciskiDoAktualizacjiPanelu("DOŁADUJ KARTĘ", this);
        doladujKarte.setBounds(550, 90, 250, 150);
        this.add(doladujKarte);
        PrzyciskiDoAktualizacjiPanelu skasujBilet = new PrzyciskiDoAktualizacjiPanelu("SKASUJ BILET", this);
        skasujBilet.setBounds(100, 350, 250, 150);
        this.add(skasujBilet);
        PrzyciskiDoAktualizacjiPanelu waznoscBiletu = new PrzyciskiDoAktualizacjiPanelu("", this);
        waznoscBiletu.setLayout(null);
        JLabel etykieta1 = new JLabel("SPRAWDŹ");
        Dimension wym1 = etykieta1.getPreferredSize();
        //System.out.println(wym1.width);
        JLabel etykieta2 = new JLabel("WAŻNOŚĆ BILETU");
        Dimension wym2 = etykieta2.getPreferredSize();
        //System.out.println(wym2.width);
        etykieta1.setFont(new Font("Cambria", Font.PLAIN, 27));
        etykieta2.setFont(new Font("Cambria", Font.PLAIN, 27));
        int przerwaMiedzyEtykietami = (150 - 38 - 38) / 3;
        etykieta1.setBounds((250 - 125) / 2, przerwaMiedzyEtykietami, 125, 38);
        etykieta2.setBounds((250 - 220) / 2, przerwaMiedzyEtykietami * 2 + 38, 220, 38);
        waznoscBiletu.add(etykieta1);
        waznoscBiletu.add(etykieta2);
        waznoscBiletu.setBounds(550, 350, 250, 150);
        this.add(waznoscBiletu);
    }

  
    void wygladPoWcisnieciuKupBilet() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        JLabel bilet_jednorazowy = new JLabel("BILET JEDNORAZOWY");
        bilet_jednorazowy.setFont(new Font("Cambria", Font.PLAIN, 50));
        Dimension wymiar = bilet_jednorazowy.getPreferredSize();
        bilet_jednorazowy.setBounds((900-wymiar.width)/2, 50, wymiar.width, wymiar.height);
        this.add(bilet_jednorazowy);
        PrzyciskiDoAktualizacjiPanelu ulgowy = new PrzyciskiDoAktualizacjiPanelu("ULGOWY - 1,80 zł", this);
        ulgowy.setBounds(300, 200, 300, 120);
        this.add(ulgowy);
        PrzyciskiDoAktualizacjiPanelu normalny = new PrzyciskiDoAktualizacjiPanelu("NORMALNY - 3,30 zł", this);
        normalny.setBounds(300, 350, 300, 120);
        this.add(normalny);
        PrzyciskiDoAktualizacjiPanelu wroc = new PrzyciskiDoAktualizacjiPanelu("WRÓĆ", this);
        wroc.setBounds(50, 480, 120, 60);
        wroc.setFont(new Font("Cambria", Font.PLAIN, 20));
        this.add(wroc);
    }

    void wygladPoWcisnieciuDoladujKarte() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        PrzyciskiDoAktualizacjiPanelu wroc = new PrzyciskiDoAktualizacjiPanelu("WRÓĆ", this);
        wroc.setBounds(50, 480, 120, 60);
        wroc.setFont(new Font("Cambria", Font.PLAIN, 20));
        this.add(wroc);
    }

    void wygladPoWcisnieciuSkasujBilet() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        PrzyciskiDoAktualizacjiPanelu wroc = new PrzyciskiDoAktualizacjiPanelu("WRÓĆ", this);
        wroc.setBounds(50, 480, 120, 60);
        wroc.setFont(new Font("Cambria", Font.PLAIN, 20));
        this.add(wroc);
    }
//    void reakcjaNaWcisniecieNumerku(JLabel x){
//       J;
//    }
    void wygladPoWcisnieciuSprawdzWaznoscBiletu() {
        
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        JLabel idText = new JLabel("   Podaj ID");
        idText.setFont(new Font("Cambria", Font.PLAIN, 27));
         int przerwaMiedzyEtykietami = (150 - 38 - 38) / 3;
        idText.setBounds((250 - 125) / 2, przerwaMiedzyEtykietami, 125, 38);
        this.add(idText);
        
        JButton zero = new JButton("0");
        zero.setFont(new Font("Cambria", Font.PLAIN, 27));
        zero.setBounds(50, 310, 50, 50);
        this.add(zero);
        
        JButton jeden = new JButton("1");
        jeden.setFont(new Font("Cambria", Font.PLAIN, 27));
        jeden.setBounds(50, 100, 50, 50);
        this.add(jeden);
        
        JButton dwa = new JButton("2");
        dwa.setFont(new Font("Cambria", Font.PLAIN, 27));
        dwa.setBounds(120, 100, 50, 50);
        this.add(dwa);
        
        JButton trzy = new JButton("3");
        trzy.setFont(new Font("Cambria", Font.PLAIN, 27));
        trzy.setBounds(190, 100, 50, 50);
        this.add(trzy);
        
        JButton cztery = new JButton("4");
        cztery.setFont(new Font("Cambria", Font.PLAIN, 27));
        cztery.setBounds(50, 170, 50, 50);
        this.add(cztery);
        
        JButton piec = new JButton("5");
        piec.setFont(new Font("Cambria", Font.PLAIN, 27));
        piec.setBounds(120, 170, 50, 50);
        this.add(piec);
        
        JButton szesc = new JButton("3");
        szesc.setFont(new Font("Cambria", Font.PLAIN, 27));
        szesc.setBounds(190, 170, 50, 50);
        this.add(szesc);
        
        JButton siedem = new JButton("7");
        siedem.setFont(new Font("Cambria", Font.PLAIN, 27));
        siedem.setBounds(50, 240, 50, 50);
        this.add(siedem);
        
        JButton osiem = new JButton("8");
        osiem.setFont(new Font("Cambria", Font.PLAIN, 27));
        osiem.setBounds(120, 240, 50, 50);
        this.add(osiem);
        
        JButton dziewiec = new JButton("9");
        dziewiec.setFont(new Font("Cambria", Font.PLAIN, 27));
        dziewiec.setBounds(190, 240, 50, 50);
        this.add(dziewiec);
        
        JLabel idLabel = new JLabel("");
        idLabel.setFont(new Font("Cambria", Font.PLAIN, 27));
        idLabel.setBounds(((250 - 125) / 2)+150, przerwaMiedzyEtykietami, 125, 38);
        this.add(idLabel);
        
        PrzyciskiDoAktualizacjiPanelu wroc = new PrzyciskiDoAktualizacjiPanelu("WRÓĆ", this);
        wroc.setBounds(50, 480, 120, 60);
        wroc.setFont(new Font("Cambria", Font.PLAIN, 20));
        this.add(wroc);
        
        JButton zatwierdzButton = new JButton("Zatwierdź");
        zatwierdzButton.setFont(new Font("Cambria", Font.PLAIN, 27));
        zatwierdzButton.setBounds(50, 380, 190, 50);
        this.add(zatwierdzButton);
        
        JButton zeruj = new JButton("Zeruj");
        zeruj.setFont(new Font("Cambria", Font.PLAIN, 27));
        zeruj.setBounds(120, 310, 120, 50);
        this.add(zeruj);
        
        JLabel wynikWpisywania = new JLabel();
        wynikWpisywania.setFont(new Font("Cambria", Font.PLAIN, 27));
        wynikWpisywania.setBounds(250 , 100, 400, 50);
        this.add(wynikWpisywania);
 
    }

}
