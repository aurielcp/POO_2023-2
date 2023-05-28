package org.example;

import org.example.controlador.ControladorLibro;
import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;
import org.example.vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Uriel C");
        VentanaLibro window = new VentanaLibro("MVC Y JDBC");
        ControladorLibro controller = new ControladorLibro(window);

    }
}