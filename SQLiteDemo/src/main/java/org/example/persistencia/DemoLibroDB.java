package org.example.persistencia;

import org.example.modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoLibroDB {

    public DemoLibroDB() {
    }

    public void insertarStatement(){
        String elTitulo = "Arrancame la vida";
        String elAutor = "Angeles Matreta";
        try {
            Statement stm = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            String sqlInsert = "INSERT INTO libros(titulo, autor) VALUES('"+elTitulo+"', '"+elAutor+"')";
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("Se insertaron " + rowCount + " registros");
        }catch (SQLException sqle){
            System.out.println("Error al conectar " + sqle.getMessage());
        }

    }
    public void insertarPreparedStatament(){
        String elTitulo = "El principito";
        String elAutor = "No se";
        String sqlInsert = "INSERT INTO libros(tirulo , autor) VALUES(?, ?)";
        try{
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, elTitulo);
            pstm.setString(2, elAutor);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        }catch (SQLException sqle){
            System.out.println("Error en Prepared statement " + sqle.getMessage());
        }

    }

    public boolean insertarLibro(Libro libro) {
        String sqlInsert = "INSERT INTO libros(titulo , autor) VALUES(?, ?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, libro.getTitulo());
            pstm.setString(2, libro.getAutor());
            rowCount = pstm.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("Error en Prepared statement " + sqle.getMessage());
        }
        return rowCount > 0;
    }

    public Libro buscarLibroPorId(int id){
        
    }
}
