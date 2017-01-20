package Interfejs_graficzny;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
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

    void wygladPoWcisnieciuSprawdzWaznoscBiletu() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
        PrzyciskiDoAktualizacjiPanelu wroc = new PrzyciskiDoAktualizacjiPanelu("WRÓĆ", this);
        wroc.setBounds(50, 480, 120, 60);
        wroc.setFont(new Font("Cambria", Font.PLAIN, 20));
        this.add(wroc);
    }

}
