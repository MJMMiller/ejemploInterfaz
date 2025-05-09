package ec.ups.edu.poo.adaptadores;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class InterrupcionesDeEnfoque implements FocusListener {

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("Se ha entrado en el componente " + e.getComponent().getName());
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("Se ha salido del componente " + e.getComponent().getName());
    }
}
