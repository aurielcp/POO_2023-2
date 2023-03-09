import java.awt.Color;
public class Lampara {
    private Color color;
    private String marca;
    private String tamaño;

    public Lampara() {
    }

    public Lampara(Color color, String marca, String tamaño) {
        this.color = color;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Lampara{" + "color=" + color + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    
    public boolean encender(){
        System.out.println("La lampara esta encendida");
        return true;
    }
    
    public boolean apagar(){
        System.out.println("La lampara esta apagada");
        return false;
    }
}
