package org.example.controlador;

import org.example.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana vista;

    public ControladorEjemplo(Ventana vista) {
        this.vista = vista;
        this.vista.getBtnMensaje().addMouseListener(this);
        this.vista.getBtnEntrada().addMouseListener(this);
        this.vista.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(vista,
                    "Hola desde el ejemplo",
                    "Titulo personalizado",
                    JOptionPane.WARNING_MESSAGE,icono);
        }
        if (e.getSource() == vista.getBtnEntrada()){
            //System.out.println("Entrada");
            String datos = JOptionPane.showInputDialog(vista,
                    "Ejemplo de entrada",
                    "Titulo personalizado",
                    JOptionPane.QUESTION_MESSAGE);
            this.vista.getLblResultado().setText(datos);
        }
        if (e.getSource() == vista.getBtnOpcion()){
            //System.out.println("Opcion");
            int respuesta = JOptionPane.showConfirmDialog(vista,
                    "¿Estas seguro de borrar el registro?",
                    "Confirmacion",
                    JOptionPane.YES_NO_OPTION);


            if (respuesta == JOptionPane.YES_OPTION){
                vista.getLblResultado().setText("Elegiste opcion si");
            }else{
                vista.getLblResultado().setText("Elegiste opcion no");
            }
        }
    }
}
