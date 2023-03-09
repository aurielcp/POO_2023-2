import java.awt.Color;
public class Giroscopio {
    private String marca;
    private Color color;
    private int tamaño;

    public Giroscopio() {
    }

    public Giroscopio(String marca, Color color, int tamaño) {
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Giroscopio{" + "marca=" + marca + ", color=" + color + ", tama\u00f1o=" + tamaño + '}';
    }
    
    public void rotar(){
        System.out.println("La forma de rotar cambio");
    }
    
    public void velocidad(){
        System.out.println("La velocidad cambio");
    }
}
