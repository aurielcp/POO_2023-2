package org.example.persistencia;

import org.example.modelo.GrupoRock;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GruposRock implements InterfazDAO {

    private ArrayList<GrupoRock> resultado;

    public GruposRock() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO gruposRock(nombre, pais, anioCreacion, numeroIntegrantes, linkImagen) VALUES(?, ?, ?, ? , ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gruposRockDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((GrupoRock) obj).getNombre());
        pstm.setString(2, ((GrupoRock) obj).getPais());
        pstm.setInt(3, ((GrupoRock) obj).getAnioCreacion());
        pstm.setInt(4, ((GrupoRock) obj).getNumeroIntegrantes());
        pstm.setString(5, ((GrupoRock) obj).getLinkImagen());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE gruposRock SET nombre = ?, pais = ?, anioCreacion = ?, numeroIntegrantes = ?, linkImagen = ? WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gruposRockDB").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((GrupoRock) obj).getNombre());
        pstm.setString(2, ((GrupoRock) obj).getPais());
        pstm.setInt(3, ((GrupoRock) obj).getAnioCreacion());
        pstm.setInt(4, ((GrupoRock) obj).getNumeroIntegrantes());
        pstm.setString(5, ((GrupoRock) obj).getLinkImagen());
        pstm.setInt(6, ((GrupoRock) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM gruposRock WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("gruposRockDB").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM gruposRock";
        ArrayList<GrupoRock> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("gruposRockDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            resultado.add(new GrupoRock(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM gruposRock WHERE id = ? ;";
        GrupoRock grupoRock = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("gruposRockDB").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            grupoRock = new GrupoRock(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4), rst.getInt(5), rst.getString(6));
            return grupoRock;
        }
        return null;
    }
}
