
package Interfejs_graficzny;

import java.awt.Dimension;
import javax.swing.JFrame;


public class Biletomat_frame extends JFrame{
    
    public static final String NAZWA_FRAME = "BILETOMAT I KASOWNIK";
    
    public Biletomat_frame(String s){
    super(s);
    this.setSize(new Dimension(900,600));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setLocation(233, 84);
    this.setResizable(false);
    this.add(new Panel());
    this.setVisible(true);
}
    
    
}
