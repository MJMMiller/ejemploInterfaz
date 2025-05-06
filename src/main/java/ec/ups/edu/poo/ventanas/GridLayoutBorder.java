package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class GridLayoutBorder {

    public GridLayoutBorder(){
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2, 3);
        Button[] botones = new Button[6];

        for (int i = 0; i < 6; i++)
            botones[i] = new Button("Botón " + i);

        miPanel.setLayout(matriz);

        Panel panelBotones = new Panel();
        GridLayout layoutInterno = new GridLayout(3, 1);
        panelBotones.setLayout(layoutInterno);
        panelBotones.add(new Button("Botón 0"));
        panelBotones.add(new Button("Botón 1"));
        panelBotones.add(new Button("Botón 2"));

        miPanel.add(panelBotones);

        for (int i = 1; i < 6; i++)
            miPanel.add(botones[i]);

        miVentana.add(miPanel);

        miVentana.setSize(500, 700);
        miVentana.setTitle("Ventana con GridLayout y Border");
        miVentana.setVisible(true);
    }
}
