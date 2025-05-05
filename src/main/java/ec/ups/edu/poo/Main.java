package ec.ups.edu.poo;

import ec.ups.edu.poo.ventanas.MiVentana;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        // Frame
        Frame mV = new Frame();

        mV.setSize(600,400);
        mV.setTitle("Mi ventana");
        Color mCCV = new Color(39, 84, 138);
        mV.setBackground(mCCV);
        mV.setLocationRelativeTo(null);

        // Button
        Button button = new Button("Log In");
        Button button1 = new Button("Register");
        Button button2 = new Button("Exit");


        //Panel Principal
        Panel mP = new Panel();

        //Panel Izquierda
        Panel mPI = new Panel();

        //Panel Derecho
        Panel mPD = new Panel();

        // Agregar a Panel Izquierdo
        mPI.add(button);
        mPI.add(button1);

        // Agregar a Panel Derecho

        mPD.add(button2);

        // Agregar al Panel Principal
        mP.add(mPI);
        mP.add(mPD);

        // Agregar a la Ventana
        mV.add(mP);
        mV.setVisible(true);

//      MiVentana mV1 = new MiVentana();

    }
}
