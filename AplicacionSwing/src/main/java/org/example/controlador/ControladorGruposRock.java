package org.example.controlador;

import org.example.modelo.GrupoRock;
import org.example.modelo.ModeloTabla;
import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorGruposRock extends MouseAdapter {
    private Ventana vista;
    private ModeloTabla modelo;

    public ControladorGruposRock(Ventana vista) {
        this.vista = vista;
        modelo = new ModeloTabla();
        this.vista.getTabla().setModel(modelo);
        this.vista.getTabla().addMouseListener(this);
        this.vista.getBtnCargar().addMouseListener(this);
        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getBtnEliminar().addMouseListener(this);
        this.vista.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.vista.getBtnCargar()) {
            modelo.cargarDatos();
            this.vista.getTabla().setModel(modelo);
            this.vista.getTabla().updateUI();
        }
        if (e.getSource() == this.vista.getBtnAgregar()) {
            GrupoRock grupoRock = new GrupoRock();
            grupoRock.setId(0);
            grupoRock.setNombre(this.vista.getTxtNombre().getText());
            grupoRock.setPais(this.vista.getTxtPais().getText());
            grupoRock.setAnioCreacion(Integer.parseInt(this.vista.getTxtAnioCreacion().getText()));
            grupoRock.setNumeroIntegrantes(Integer.parseInt(this.vista.getTxtNumeroIntegrantes().getText()));
            grupoRock.setLinkImagen(this.vista.getTxtLinkImagen().getText());
            if (modelo.agregarGrupoRock(grupoRock)) {
                JOptionPane.showMessageDialog(vista, "Se agreg\u00f3 correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.vista.getTabla().updateUI();
            } else {
                JOptionPane.showMessageDialog(vista, "No se pudo agregar a la base de datos, por favor revise su conexi\u00f3n",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.vista.limpiar();
        }
        if (e.getSource() == this.vista.getTabla()) {
            int index = this.vista.getTabla().getSelectedRow();
            GrupoRock tmp = modelo.getGrupoRockI(index);
            this.vista.getTxtIdTabla().setText(String.valueOf(tmp.getId()));
            this.vista.getTxtIdMod().setText(String.valueOf(tmp.getId()));
            this.vista.getTxtNombreMod().setText(tmp.getNombre());
            this.vista.getTxtPaisMod().setText(tmp.getPais());
            this.vista.getTxtAnioCreacionMod().setText(String.valueOf(tmp.getAnioCreacion()));
            this.vista.getTxtNumeroIntegrantesMod().setText(String.valueOf(tmp.getNumeroIntegrantes()));
            this.vista.getTxtLinkImagenMod().setText(tmp.getLinkImagen());
            try {
                this.vista.getLblImagen().setIcon(tmp.getImageIcon());
            } catch (MalformedURLException emurle) {
                JOptionPane.showMessageDialog(null, "La imagen no existe");
            }
        }
        if (e.getSource() == this.vista.getBtnEliminar()) {
            //JOptionPane.showMessageDialog(vista, "Presionaste Eliminar", "Aviso", JOptionPane.ERROR_MESSAGE);
            ModeloTabla tabla = new ModeloTabla();
            int index = this.vista.getTabla().getSelectedRow();
            GrupoRock grupoRock = modelo.getGrupoRockI(index);
            int respuesta = JOptionPane.showConfirmDialog(vista,
                    "\u00bfEstas seguro de eliminar?",
                    "Advertencia",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                if (tabla.eliminarGrupoRock(String.valueOf(grupoRock.getId()))) {
                    JOptionPane.showMessageDialog(vista, "Elemento eliminado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    modelo.cargarDatos();
                    this.vista.getTabla().setModel(modelo);
                    this.vista.getTabla().updateUI();
                } else {
                    JOptionPane.showMessageDialog(vista, "Ocurri\u00f3 un error", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                this.vista.limpiar();
            }
        }
        if (e.getSource() == this.vista.getBtnActualizar()){
            int index = this.vista.getTabla().getSelectedRow();
            GrupoRock tmp = modelo.getGrupoRockI(index);
            GrupoRock grupoRock = new GrupoRock();

            grupoRock.setId(tmp.getId());
            grupoRock.setNombre(this.vista.getTxtNombreMod().getText());
            grupoRock.setPais(this.vista.getTxtPaisMod().getText());
            grupoRock.setAnioCreacion(Integer.parseInt(this.vista.getTxtAnioCreacionMod().getText()));
            grupoRock.setNumeroIntegrantes(Integer.parseInt(this.vista.getTxtNumeroIntegrantesMod().getText()));
            grupoRock.setLinkImagen(this.vista.getTxtLinkImagenMod().getText());

            int respuesta = JOptionPane.showConfirmDialog(vista, "\u00bfEstas seguro de modificar?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION){
                if (modelo.modificarGrupoRock(grupoRock)){
                    JOptionPane.showMessageDialog(vista, "Se modific\u00f3 con \u00e9xito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    modelo.cargarDatos();
                    this.vista.getTabla().setModel(modelo);
                    this.vista.getTabla().updateUI();
                }
            }
        }
    }
}

