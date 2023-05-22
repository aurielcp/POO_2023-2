package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DemoLibroDB demo = new DemoLibroDB();

        Libro libro = new Libro(0, "El Juego", "Desconocido");

        if (demo.insertarLibro(libro)){
            System.out.println("Se inserto correctamente");
        }else{
            System.out.println("No se inserto");
        }
    }
}