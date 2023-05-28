package org.example.controlador;

import org.example.modelo.Libro;
import org.example.modelo.ModeloTablaLibro;
import org.example.vista.VentanaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro vista;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro vista) {
        this.vista = vista;
        modelo = new ModeloTablaLibro();
        this.vista.getTblLibro().setModel(modelo);
        this.vista.getBtnCargar().addMouseListener(this);
        this.vista.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.vista.getBtnCargar()){

            modelo.cargarDatos();
            this.vista.getTblLibro().setModel(modelo);
            this.vista.getTblLibro().updateUI();
        }
        if (e.getSource() == this.vista.getBtnAgregar()){
            Libro libro = new Libro();
            libro.setId(0);
            libro.setTitulo(this.vista.getTxtTitulo().getText());
            libro.setAutor(this.vista.getTxtAutor().getText());
            if (modelo.agregarLibro(libro)){
                JOptionPane.showMessageDialog(vista, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTblLibro().updateUI();
            }else{
                JOptionPane.showMessageDialog(vista, "No se pudo agregar a a la base de datos. Por favor revise su conexión ",
                        "Error al insertar",
                        JOptionPane.ERROR_MESSAGE
                        );
            }
            this.vista.limpiar();
        }
    }

}
