package excepcionesejemplos;

import java.util.Scanner;

public class ExcepcionesEjemplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        try {
            int a = 10;
            int b = Integer.parseInt(teclado.nextLine());
            System.out.println( "División: " + (a/b) );
        } catch (ArithmeticException e) {
            System.out.println("No se puede dicidir entre cero");
        }catch(NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        }finally{
            System.out.println("Fin del programa");
        }
        
    }
    
}
