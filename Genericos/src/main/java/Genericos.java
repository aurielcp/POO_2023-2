
import java.util.ArrayList;

public class Genericos {

    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);
        
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);
        
        System.out.println("-----Comida-----");
        
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yoguth", true));
        System.out.println(cajaComida.get(0));
        
        ArrayList<Comida> comida = new ArrayList<>();
        comida.add(new Comida("Yogurth", false))
    }
}
