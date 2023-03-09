import java.awt.Color;
public class Tarea7 {

    public static void main(String[] args) {
        Pais pais1 = new Pais("Mexico", "Español", "America");
        System.out.println(pais1);
        
        Giroscopio giroscopio1 = new Giroscopio("Samsung", Color.yellow, 50);
        System.out.println(giroscopio1);
        
        Computadora computadora1 = new Computadora("Huawei", Color.black, 20000);
        System.out.println(computadora1);
        
        CuboRubik cubo1 = new CuboRubik("Cubiks", "3x3", 598);
        System.out.println(cubo1);
        
        Libro libro1 = new Libro("JavaFondo", 60, Color.YELLOW);
        System.out.println(libro1);
        
        Balon balon1 = new Balon("Futbol", Color.black, "cuero");
        System.out.println(balon1);
        
        Lampara lampara1 = new Lampara(Color.gray, "Aurrera", "Grande");
        System.out.println(lampara1);
        
        Gato gato1 = new Gato(Color.BLACK, "1 año", "Masculino");
        System.out.println(gato1);
    }
}
