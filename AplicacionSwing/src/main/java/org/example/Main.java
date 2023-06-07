package org.example;

import org.example.controlador.ControladorGruposRock;
import org.example.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana view = new Ventana("Grupos de Rock");
        ControladorGruposRock controlador = new ControladorGruposRock(view);
    }
}