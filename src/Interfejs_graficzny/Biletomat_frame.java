
package Interfejs_graficzny;

import java.awt.Dimension;
import javax.swing.JFrame;


public class Biletomat_frame extends JFrame{
    
    public Biletomat_frame(String s){
    super(s);
    this.setSize(new Dimension(800,600));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
}
    
    
}
