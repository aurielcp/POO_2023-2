package org.example.controlador;

import org.example.modelo.ModeloTablaLibro;
import org.example.vista.VentanaLibro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private VentanaLibro vista;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro vista) {
        this.vista = vista;
        this.vista.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.vista.getBtnCargar()){
            modelo = new ModeloTablaLibro();
            modelo.cargarDatos();
            this.vista.getTblLibro().setModel(modelo);
            this.vista.getTblLibro().updateUI();
        }
        super.mouseClicked(e);
    }
}
