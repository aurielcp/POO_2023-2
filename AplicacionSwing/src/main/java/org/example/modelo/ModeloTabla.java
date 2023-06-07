package org.example.modelo;

import org.example.persistencia.GruposRock;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    private ArrayList<GrupoRock> datos;
    public static final int COLUMNS = 6;
    private GruposRock grupoRockDatos;

    public ModeloTabla() {
        grupoRockDatos = new GruposRock();
        datos = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<GrupoRock> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Pa\u00eds";
            case 3:
                return "A\u00f1o de creaci\u00f3n";
            case 4:
                return "N\u00famero de integrantes";
            case 5:
                return "Link";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GrupoRock tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getPais();
            case 3:
                return tmp.getAnioCreacion();
            case 4:
                return tmp.getNumeroIntegrantes();
            case 5:
                return tmp.getLinkImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId( (Integer) aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombre( (String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setPais( (String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setAnioCreacion( (Integer) aValue);
                break;
            case 4:
                datos.get(rowIndex).setNumeroIntegrantes( (Integer) aValue);
                break;
            case 5:
                datos.get(rowIndex).setLinkImagen( (String) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try{
            datos = grupoRockDatos.obtenerTodo();
        }catch (SQLException sqle){
            //JOptionPane.showMessageDialog(null, "Error al obtener los datos", "Aviso", JOptionPane.ERROR_MESSAGE);
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarGrupoRock(GrupoRock grupoRock){
        boolean resultado = false;
        try {
            if(grupoRockDatos.insertar(grupoRock)){
                datos.add(grupoRock);
                resultado = true;
            }else{
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public GrupoRock getGrupoRockI(int index){
        return datos.get(index);
    }

    public boolean eliminarGrupoRock(String id){
        boolean resultado = false;
        try {
            if (grupoRockDatos.delete(id)) {
                resultado = true;
            }else {
                resultado = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public boolean modificarGrupoRock(GrupoRock grupoRock){
        boolean resultado = false;
        try {
            if(grupoRockDatos.update(grupoRock)){
                datos.add(grupoRock);
                resultado = true;
            }else{
                resultado = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return resultado;
    }
}