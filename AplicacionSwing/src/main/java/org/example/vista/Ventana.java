package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblPais;
    private JLabel lblAnioCreacion;
    private JLabel lblNumeroIntegrantes;
    private JLabel lblLinkImagen;
    private JLabel lblImagen;
    private JLabel lblMensaje;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtPais;
    private JTextField txtAnioCreacion;
    private JTextField txtNumeroIntegrantes;
    private JTextField txtLinkImagen;
    private JTextField txtIdTabla;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;
    private JLabel lblIdMod;
    private JLabel lblNombreMod;
    private JLabel lblPaisMod;
    private JLabel lblAnioCreacionMod;
    private JLabel lblNumeroIntegrantesMod;
    private JLabel lblLinkImagenMod;
    private JLabel lblImagenMod;
    private JLabel lblMensajeMod;
    private JTextField txtIdMod;
    private JTextField txtNombreMod;
    private JTextField txtPaisMod;
    private JTextField txtAnioCreacionMod;
    private JTextField txtNumeroIntegrantesMod;
    private JTextField txtLinkImagenMod;
    private JLabel lblEspacio;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1020,850);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(230, 252, 245));

        lblId = new JLabel("Id: ");
        lblNombre = new JLabel("Nombre: ");
        lblPais = new JLabel("Pa\u00eds: ");
        lblAnioCreacion = new JLabel("A\u00f1o de creaci\u00f3n: ");
        lblNumeroIntegrantes = new JLabel("N\u00famero de integrantes: ");
        lblLinkImagen = new JLabel("Link de imagen: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(15);
        txtPais = new JTextField(10);
        txtAnioCreacion = new JTextField(4);
        txtNumeroIntegrantes = new JTextField(2);
        txtLinkImagen = new JTextField(25);
        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblPais);
        panel1.add(txtPais);
        panel1.add(lblAnioCreacion);
        panel1.add(txtAnioCreacion);
        panel1.add(lblNumeroIntegrantes);
        panel1.add(txtNumeroIntegrantes);
        panel1.add(lblLinkImagen);
        panel1.add(txtLinkImagen);
        panel1.add(btnAgregar);

        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(195, 250, 232));

        btnCargar = new JButton("Cargar");
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(btnCargar);
        panel2.add(scroll);

        //Panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(150, 242, 215));
        lblImagen = new JLabel("");
        panel3.add(lblImagen);

        //Panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(99, 239, 190));
        lblMensaje = new JLabel("Elemento seleccionado: ");
        btnEliminar = new JButton("Eliminar");
        btnActualizar = new JButton("Modificar");
        txtIdTabla = new JTextField(3);
        txtIdTabla.setEnabled(false);
        //Formulario para modificar
        lblIdMod = new JLabel("Id:");
        lblNombreMod = new JLabel("Nombre:");
        lblPaisMod = new JLabel("Pa\u00eds:");
        lblAnioCreacionMod = new JLabel("A\u00f1o de creaci\u00f3n");
        lblNumeroIntegrantesMod = new JLabel("N\u00famero de integrantes:");
        lblLinkImagenMod = new JLabel("Link de imagen");
        txtIdMod = new JTextField(3);
        txtIdMod.setEnabled(false);
        txtNombreMod = new JTextField(15);
        txtPaisMod = new JTextField(10);
        txtAnioCreacionMod = new JTextField(4);
        txtNumeroIntegrantesMod = new JTextField(2);
        txtLinkImagenMod = new JTextField(25);
        lblEspacio = new JLabel("                                                                               ");

        panel4.add(lblMensaje);
        panel4.add(txtIdTabla);
        panel4.add(btnEliminar);
        //Formulario
        panel4.add(lblEspacio);
        panel4.add(lblIdMod);
        panel4.add(txtIdMod);
        panel4.add(lblNombreMod);
        panel4.add(txtNombreMod);
        panel4.add(lblPaisMod);
        panel4.add(txtPaisMod);
        panel4.add(lblAnioCreacionMod);
        panel4.add(txtAnioCreacionMod);
        panel4.add(lblNumeroIntegrantesMod);
        panel4.add(txtNumeroIntegrantesMod);
        panel4.add(lblLinkImagenMod);
        panel4.add(txtLinkImagenMod);
        panel4.add(btnActualizar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblPais() {
        return lblPais;
    }

    public void setLblPais(JLabel lblPais) {
        this.lblPais = lblPais;
    }

    public JLabel getLblAnioCreacion() {
        return lblAnioCreacion;
    }

    public void setLblAnioCreacion(JLabel lblAnioCreacion) {
        this.lblAnioCreacion = lblAnioCreacion;
    }

    public JLabel getLblNumeroIntegrantes() {
        return lblNumeroIntegrantes;
    }

    public void setLblNumeroIntegrantes(JLabel lblNumeroIntegrantes) {
        this.lblNumeroIntegrantes = lblNumeroIntegrantes;
    }

    public JLabel getLblLinkImagen() {
        return lblLinkImagen;
    }

    public void setLblLinkImagen(JLabel lblLinkImagen) {
        this.lblLinkImagen = lblLinkImagen;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPais() {
        return txtPais;
    }

    public void setTxtPais(JTextField txtPais) {
        this.txtPais = txtPais;
    }

    public JTextField getTxtAnioCreacion() {
        return txtAnioCreacion;
    }

    public void setTxtAnioCreacion(JTextField txtAnioCreacion) {
        this.txtAnioCreacion = txtAnioCreacion;
    }

    public JTextField getTxtNumeroIntegrantes() {
        return txtNumeroIntegrantes;
    }

    public void setTxtNumeroIntegrantes(JTextField txtNumeroIntegrantes) {
        this.txtNumeroIntegrantes = txtNumeroIntegrantes;
    }

    public JTextField getTxtLinkImagen() {
        return txtLinkImagen;
    }

    public void setTxtLinkImagen(JTextField txtLinkImagen) {
        this.txtLinkImagen = txtLinkImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtPais.setText("");
        txtAnioCreacion.setText("");
        txtNumeroIntegrantes.setText("");
        txtLinkImagen.setText("");
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblMensaje() {
        return lblMensaje;
    }

    public void setLblMensaje(JLabel lblMensaje) {
        this.lblMensaje = lblMensaje;
    }

    public JTextField getTxtIdTabla() {
        return txtIdTabla;
    }

    public void setTxtIdTabla(JTextField txtIdTabla) {
        this.txtIdTabla = txtIdTabla;
    }

    public JLabel getLblIdMod() {
        return lblIdMod;
    }

    public void setLblIdMod(JLabel lblIdMod) {
        this.lblIdMod = lblIdMod;
    }

    public JLabel getLblNombreMod() {
        return lblNombreMod;
    }

    public void setLblNombreMod(JLabel lblNombreMod) {
        this.lblNombreMod = lblNombreMod;
    }

    public JLabel getLblPaisMod() {
        return lblPaisMod;
    }

    public void setLblPaisMod(JLabel lblPaisMod) {
        this.lblPaisMod = lblPaisMod;
    }

    public JLabel getLblAnioCreacionMod() {
        return lblAnioCreacionMod;
    }

    public void setLblAnioCreacionMod(JLabel lblAnioCreacionMod) {
        this.lblAnioCreacionMod = lblAnioCreacionMod;
    }

    public JLabel getLblNumeroIntegrantesMod() {
        return lblNumeroIntegrantesMod;
    }

    public void setLblNumeroIntegrantesMod(JLabel lblNumeroIntegrantesMod) {
        this.lblNumeroIntegrantesMod = lblNumeroIntegrantesMod;
    }

    public JLabel getLblLinkImagenMod() {
        return lblLinkImagenMod;
    }

    public void setLblLinkImagenMod(JLabel lblLinkImagenMod) {
        this.lblLinkImagenMod = lblLinkImagenMod;
    }

    public JLabel getLblImagenMod() {
        return lblImagenMod;
    }

    public void setLblImagenMod(JLabel lblImagenMod) {
        this.lblImagenMod = lblImagenMod;
    }

    public JLabel getLblMensajeMod() {
        return lblMensajeMod;
    }

    public void setLblMensajeMod(JLabel lblMensajeMod) {
        this.lblMensajeMod = lblMensajeMod;
    }

    public JTextField getTxtIdMod() {
        return txtIdMod;
    }

    public void setTxtIdMod(JTextField txtIdMod) {
        this.txtIdMod = txtIdMod;
    }

    public JTextField getTxtNombreMod() {
        return txtNombreMod;
    }

    public void setTxtNombreMod(JTextField txtNombreMod) {
        this.txtNombreMod = txtNombreMod;
    }

    public JTextField getTxtPaisMod() {
        return txtPaisMod;
    }

    public void setTxtPaisMod(JTextField txtPaisMod) {
        this.txtPaisMod = txtPaisMod;
    }

    public JTextField getTxtAnioCreacionMod() {
        return txtAnioCreacionMod;
    }

    public void setTxtAnioCreacionMod(JTextField txtAnioCreacionMod) {
        this.txtAnioCreacionMod = txtAnioCreacionMod;
    }

    public JTextField getTxtNumeroIntegrantesMod() {
        return txtNumeroIntegrantesMod;
    }

    public void setTxtNumeroIntegrantesMod(JTextField txtNumeroIntegrantesMod) {
        this.txtNumeroIntegrantesMod = txtNumeroIntegrantesMod;
    }

    public JTextField getTxtLinkImagenMod() {
        return txtLinkImagenMod;
    }

    public void setTxtLinkImagenMod(JTextField txtLinkImagenMod) {
        this.txtLinkImagenMod = txtLinkImagenMod;
    }

}
