package ec.ups.edu.poo.ventanas;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaPaneles {

    public VentanaPaneles() {
        Frame ventana = new Frame("Ventana con Paneles");
        ventana.setSize(400, 200);
        ventana.setLocationRelativeTo(null);

        Button login = new Button("Log In");
        Button register = new Button("Register");
        Button exit = new Button("Exit");

        Panel panelPrincipal = new Panel();
        Panel panelIzquierdo = new Panel();
        Panel panelDerecho = new Panel();

        panelIzquierdo.add(login);
        panelIzquierdo.add(register);
        panelDerecho.add(exit);

        panelPrincipal.add(panelIzquierdo);
        panelPrincipal.add(panelDerecho);

        ventana.add(panelPrincipal);
        ventana.setVisible(true);

        ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
            }
        });
    }
}
