package ec.ups.edu.poo.ventanas;

import java.awt.*;

public class GridLayout1 extends Frame {

    public GridLayout1(){

        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(3, 3);
        Button[] botones = new Button[9];

        for (int i = 0; i < 9; i++)
            botones[i] = new Button("Botón " + i);

        miPanel.setLayout(matriz);

        for (int i = 0; i < 9; i++)
            miPanel.add(botones[i]);

        miVentana.add(miPanel);

        miVentana.setSize(300, 100);
        miVentana.setTitle("Ventana con GridLayout");
        miVentana.setVisible(true);

    }
}
