
package pruebaaccesoexterior;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClaseAction implements ActionListener {
    private Ventana vent;
    public ClaseAction(Ventana vent){
        this.vent=vent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton=e.getSource();
        if(boton==this.vent.bAzul){
            this.vent.panel.setBackground(Color.BLUE);
        }
    }
    
}
