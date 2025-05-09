package ec.ups.edu.poo.ventanas;

import ec.ups.edu.poo.adaptadores.InterrupcionesDeElemento;

import java.awt.*;

public class InterrupcionesElemento extends Frame {

    public InterrupcionesElemento(){

        Frame miVentana = new Frame("Prueba eventos de elemento");
        Panel miPanel = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        miPanel.add(diesel);
        miPanel.add(farosXenon);
        miPanel.add(llantasAleacion);
        miPanel.add(pinturaMetalizada);
        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        miVentana.add(miPanel);
        miVentana.setSize(400, 200);
        miVentana.setVisible(true);

    }
}
