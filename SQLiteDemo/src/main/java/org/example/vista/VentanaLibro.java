package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaLibro extends JFrame {
    private JLabel lblId;
    private JLabel lblTitulo;
    private JLabel lblAutor;
    private TextField txtId;
    private TextField txtTitulo;
    private TextField txtAutor;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblLibro;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1; //Formulario para capturar libros
    private JPanel panel2; //Tabla para mostrar libros de DB
    private JPanel panel3;
    private JPanel panel4;

    public VentanaLibro(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(245, 192, 192));
        lblId = new JLabel("Id: ");
        lblTitulo = new JLabel("Titulo: ");
        lblAutor = new JLabel("Autor: ");
        txtId = new TextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtTitulo = new TextField(15);
        txtAutor = new TextField(15);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblTitulo);
        panel1.add(txtTitulo);
        panel1.add(lblAutor);
        panel1.add(txtAutor);
        panel1.add(btnAgregar);

        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(224, 236, 197));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblLibro = new JTable();
        scrollPane = new JScrollPane(tblLibro);
        panel2.add(scrollPane);
        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(182, 193, 227));
        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(216, 191, 236));

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblAutor() {
        return lblAutor;
    }

    public void setLblAutor(JLabel lblAutor) {
        this.lblAutor = lblAutor;
    }

    public TextField getTxtId() {
        return txtId;
    }

    public void setTxtId(TextField txtId) {
        this.txtId = txtId;
    }

    public TextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(TextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public TextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(TextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblLibro() {
        return tblLibro;
    }

    public void setTblLibro(JTable tblLibro) {
        this.tblLibro = tblLibro;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
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

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
}