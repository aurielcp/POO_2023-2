import java.util.Scanner;
//Clase para separar cadenas 
public class Cadenas{
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingresa tu nombre, profesión y nacionalidad: ");
        String cadena = datos.nextLine();

        String[] elementos = cadena.split(" ");
        
        String nombre = elementos[0].toUpperCase();
        String profesion = elementos[1].toUpperCase();
        String pais = elementos[2].toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("País: " + pais);
    }
}
