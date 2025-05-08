package ec.ups.edu.poo.ventanas;

import ec.ups.edu.poo.adaptadores.EsquemaRaton;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerColor extends Frame{

    public MouseListenerColor(){
        Frame miVentana = new Frame("Esquema de eventos");
        Panel miPanel = new Panel();

        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");

        miPanel.add(botonHola);
        miPanel.add(botonAdios);
        miVentana.add(miPanel);

        //CLASE ANONIMA SOLO SE USA EN ESTE CASO PARA EL PANEL

        miPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(Color.blue);
            }
        });

        miVentana.setSize(600, 400);
        miVentana.setVisible(true);



        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());

    }
}
