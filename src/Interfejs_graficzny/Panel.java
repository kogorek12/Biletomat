package Interfejs_graficzny;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public static final int SZEROKOSC = 900;
    public static final int WYSOKOSC = 600;

    public Panel() {
        super();
        wlasciwosciEkranuStartowego();
    }

    public void wlasciwosciEkranuStartowego() {
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

  

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color kolorPoprzedni = g.getColor();
        g.setColor(Color.black);
        for (int i = -1; i < 2; i++) {

            g.drawLine((SZEROKOSC / 2) + i, WYSOKOSC - 550, (SZEROKOSC / 2) + i, WYSOKOSC - 80);

        }
        g.setColor(kolorPoprzedni);
    }

    void wygladPoWcisnieciuKupBilet() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
    }

    void wygladPoWcisnieciuDoladujKarte() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
    }

    void wygladPoWcisnieciuSkasujBilet() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
    }

    void wygladPoWcisnieciuSprawdzWaznoscBiletu() {
        this.setVisible(true);
        this.setBackground(new Color(93, 155, 155, 255));
    }

}
