package ec.ups.edu.poo.ventanas;

import ec.ups.edu.poo.adaptadores.InterrupcionesDeTeclado;

import java.awt.*;

public class InterrupcionTeclado extends Frame {

    public InterrupcionTeclado() {

        Frame miVentana = new Frame("Prueba eventos de raton");
        Panel miPanel = new Panel();
        Button boton1 = new Button("Silencio");
        Button boton2 = new Button("Máquina de escribir");
        miPanel.add(boton1);
        miPanel.add(boton2);
        miVentana.add(miPanel);
        miVentana.setSize(400, 400);
        miVentana.setVisible(true);
        boton2.addKeyListener(new InterrupcionesDeTeclado());

    }
}
