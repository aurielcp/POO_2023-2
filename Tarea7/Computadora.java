import java.awt.Color;
public class Computadora {
    private String marca;
    private Color color;
    private int precio;

    public Computadora() {
    }

    public Computadora(String marca, Color color, int precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", color=" + color + ", precio=" + precio + '}';
    }
    
    public boolean encender(){
        System.out.println("Ña computadora esta encendida");
        return true;
    }
    
    public boolean apagar(){
        System.out.println("La computadora esta apagada");
        return false;
    }
}
