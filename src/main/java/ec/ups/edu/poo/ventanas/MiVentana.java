package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class MiVentana  extends Frame {

    public MiVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }

    public MiVentana(String titulo, int ancho, int alto){
        this(titulo);
        this.setSize(ancho, alto);
    }

    public MiVentana(){
        this("Mi ventana 1", 600,400);
    }


}
