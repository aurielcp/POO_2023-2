package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class GrupoRock {
    private int id;
    private String nombre;
    private String pais;
    private int anioCreacion;
    private int numeroIntegrantes;
    private String linkImagen;

    public GrupoRock() {
    }

    public GrupoRock(int id, String nombre, String pais, int anioCreacion, int numeroIntegrantes, String linkImagen) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.anioCreacion = anioCreacion;
        this.numeroIntegrantes = numeroIntegrantes;
        this.linkImagen = linkImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }

    @Override
    public String toString() {
        return "GruposRock{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", añoCreacion=" + anioCreacion +
                ", numeroIntegrantes=" + numeroIntegrantes +
                ", linkImagen='" + linkImagen + '\'' +
                '}';
    }

    public ImageIcon getImageIcon() throws MalformedURLException{
        URL urlImagen = new URL(this.linkImagen);
        return new ImageIcon(urlImagen);
    }
}
