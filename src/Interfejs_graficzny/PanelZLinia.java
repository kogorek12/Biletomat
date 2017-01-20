
package Interfejs_graficzny;

import static Interfejs_graficzny.Panel.SZEROKOSC;
import static Interfejs_graficzny.Panel.WYSOKOSC;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelZLinia extends JPanel {
    
    public PanelZLinia(){
        super();
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
    
}
