package ec.ups.edu.poo.adaptadores;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EsquemaRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e){
//        e.getComponent().setBackground(Color.GREEN);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        e.getComponent().setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        e.getComponent().setBackground(Color.PINK);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        e.getComponent().setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        e.getComponent().setBackground(Color.blue);
    }
}
