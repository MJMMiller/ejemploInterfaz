package ec.ups.edu.poo.ventanas;

import ec.ups.edu.poo.adaptadores.InterrupcionesDeVentana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterrupcionesVentana extends Frame {

    public InterrupcionesVentana(){

        Frame miVentana = new Frame("Prueba eventos de ventana");
        miVentana.setSize(400, 200);

        miVentana.addWindowListener(new InterrupcionesDeVentana());
        miVentana.setVisible(true);

        Button miButton = new Button("Abrir la otra ventana");
        miVentana.add(miButton);


        Frame otraVentana = new Frame("Prueba eventos de ventana");
        otraVentana.setSize(400, 200);
        otraVentana.setLocation(400, 0);

        otraVentana.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.setVisible(true);

        miButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                otraVentana.setVisible(true);

            }
        });

        miVentana.add(miButton);

    }
}
