package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class CampoDeTexto extends Frame {

    public CampoDeTexto(){

        Frame miMarco = new Frame();
        Panel miPanel = new Panel();
        TextField nombre = new TextField(20);
        TextField apellido = new TextField(15);
        TextField nacionalidad = new TextField("Ecuatoriana",10);

        miPanel.add(nombre);
        miPanel.add(apellido);
        miPanel.add(nacionalidad);

        miMarco.add(miPanel);
        miMarco.setSize(500,200);
        miMarco.setTitle("Ventana con campos de texto");
        miMarco.setVisible(true);


    }
}
