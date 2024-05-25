package com.edwin;

import javax.swing.SwingUtilities;

import com.edwin.controller.VistaEvento;

public class Main {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> new VistaEvento() );
    }
}