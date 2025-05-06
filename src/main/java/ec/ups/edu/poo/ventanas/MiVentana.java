package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class MiVentana extends Frame {

    public MiVentana() {
        this("Ventana 1", 600, 400);
    }

    public MiVentana(String titulo) {
        this(titulo, 600, 400);
    }

    public MiVentana(String titulo, int ancho, int alto) {
        setTitle(titulo);
        setSize(ancho, alto);
        setVisible(true);
    }
}