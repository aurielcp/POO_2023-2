package tablamvc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.*;

public class Ventana extends JFrame{
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarollador;
    private JButton btnAgeregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;
    

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);
        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(188,227,166));
        lblId = new JLabel("Id:");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        lblGenero = new JLabel("Genero:");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        lblPeso = new JLabel("Peso Gb:");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        lblDesarollador = new JLabel("Desarollador:");
        txtDesarollador = new JTextField(25);
        panel1.add(lblDesarollador);
        panel1.add(txtDesarollador);
        btnAgeregar = new JButton("Agregar juego");
        panel1.add(btnAgeregar);
        
        this.getContentPane().add(panel1, 0);
        
        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(201, 195, 241));
        info = new ArrayList<>();
        info.add(new Videojuego(1, "League of Legends", "Moba", 4.5, "Windows y Mac",
                "Riot Games"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);
        
        this.getContentPane().add(panel2, 1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}