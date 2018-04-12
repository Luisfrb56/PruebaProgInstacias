package pruebaaccesoexterior;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton bAzul;
    
    public Ventana(){
        marco=new JFrame("Ventana");
        panel=new JPanel();
        bAzul=new JButton("Azul");
        marco.setSize(400, 200);
        panel.add(bAzul);
        marco.add(panel);
        bAzul.addActionListener(new ClaseAction(this));
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
}
