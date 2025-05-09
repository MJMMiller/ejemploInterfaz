package ec.ups.edu.poo.ventanas;

import ec.ups.edu.poo.adaptadores.InterrupcionesDeEnfoque;

import java.awt.*;

public class InterrupcionesEnfoque  extends Frame {

    public InterrupcionesEnfoque(){

        Frame miVentana = new Frame("Prueba de eventos de enfoque");
        Panel miPanel = new Panel();
        Button boton1 = new Button("Componente 1");
        Button boton2 = new Button("Componente 2");
        miPanel.add(boton1);
        miPanel.add(boton2);
        miVentana.add(miPanel);
        miVentana.setSize(300, 200);
        miVentana.setVisible(true);
        boton1.addFocusListener(new InterrupcionesDeEnfoque());
        boton2.addFocusListener(new InterrupcionesDeEnfoque());

    }

}
