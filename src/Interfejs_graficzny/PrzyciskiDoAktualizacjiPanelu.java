
package Interfejs_graficzny;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class PrzyciskiDoAktualizacjiPanelu extends JButton implements ActionListener{
    
    
    private Panel aktualizowanyPanel;
    private String nazwaPrzycisku;
    
    
    public PrzyciskiDoAktualizacjiPanelu(String nazwaPrzycisku, Panel aktualizowanyPanel){
        super(nazwaPrzycisku);
        this.setVisible(true);
        this.setBackground(new Color(184, 183, 153, 255));
        this.setFont(new Font("Cambria", Font.PLAIN, 30));
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.aktualizowanyPanel = aktualizowanyPanel;
        this.addActionListener(this);
        this.nazwaPrzycisku = nazwaPrzycisku;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object zrodlo = ae.getSource();
        if (zrodlo == this){
            this.aktualizowanyPanel.removeAll();
            this.aktualizowanyPanel.setOpaque(true);
            if(this.nazwaPrzycisku.equals("KUP BILET")){
                this.aktualizowanyPanel.wygladPoWcisnieciuKupBilet();
            }
            else if(this.nazwaPrzycisku.equals("DOŁADUJ KARTĘ")){
                 this.aktualizowanyPanel.wygladPoWcisnieciuDoladujKarte();
            }
            else if(this.nazwaPrzycisku.equals("SKASUJ BILET")){
                this.aktualizowanyPanel.wygladPoWcisnieciuSkasujBilet();
            }
            else if(this.nazwaPrzycisku.equals("")){
                this.aktualizowanyPanel.wygladPoWcisnieciuSprawdzWaznoscBiletu();
            }
            else if(this.nazwaPrzycisku.equals("WRÓĆ")){
                this.aktualizowanyPanel.wlasciwosciEkranuStartowego();
            }
            
            this.aktualizowanyPanel.repaint();
        }
      
    }
    
}
