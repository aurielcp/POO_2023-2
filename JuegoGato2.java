import java.util.Scanner;

public class JuegoGato2 {

    public static void main(String[] args) {
        char columnas = 124;
        char filas = 45;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cadena de 9 caracteres(X,0,_)");
        String cadena = sc.nextLine();
        String[] caracteres = cadena.split("");
        
        System.out.print(filas);
        System.out.print(filas);
        System.out.print(filas);
        System.out.print(filas);
        System.out.println(filas);
        System.out.println(columnas + caracteres[0] + caracteres[1] + caracteres[2] + columnas);
        System.out.println(columnas + caracteres[3] + caracteres[4] + caracteres[5] + columnas);
        System.out.println(columnas + caracteres[6] + caracteres[7] + caracteres[8] + columnas);
        System.out.print(filas);
        System.out.print(filas);
        System.out.print(filas);
        System.out.print(filas);
        System.out.println(filas);
    }
}
