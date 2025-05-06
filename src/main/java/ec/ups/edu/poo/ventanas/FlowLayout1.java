package ec.ups.edu.poo.ventanas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout1 {

    public FlowLayout1() {
        Frame ventana = new Frame("Ventana con layout");
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setBackground(new Color(39, 84, 138));
        ventana.setLayout(new FlowLayout());

        Button botonA = new Button("Primer botón");
        Button botonB = new Button("Segundo botón");
        Button botonC = new Button("Tercer botón");
        Button botonD = new Button("Cuarto botón");

        ventana.add(botonA);
        ventana.add(botonB);
        ventana.add(botonC);
        ventana.add(botonD);

        ventana.setVisible(true);

        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
            }
        });
    }
}
