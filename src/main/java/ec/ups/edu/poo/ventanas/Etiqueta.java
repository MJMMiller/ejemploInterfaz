package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class Etiqueta extends Frame {

    public Etiqueta(){

        Frame miMarco = new Frame();
        Label titulo = new Label("Hola Mundo");

        miMarco.add(titulo);

        miMarco.setSize(300,200);
        miMarco.setTitle("Ventana con etiqueta");
        miMarco.setVisible(true);

    }
}
