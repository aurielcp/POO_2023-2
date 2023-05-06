package excepcionesdos;

import java.io.IOException;

public class ExcepcionesDos {
    public static void main(String[] args) {
        LeerArchivo lectura = new LeerArchivo();
        try {
            lectura.metodoUno("C:\\Cursos\\Java\\POO\\ExcepcionesDos\\src\\excepcionesdos\\datos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }
}
