import java.awt.Color;
public class Libro {
    private String titulo;
    private int tamaño;
    private Color color;

    public Libro() {
    }

    public Libro(String titulo, int tamaño, Color color) {
        this.titulo = titulo;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", tama\u00f1o=" + tamaño + ", color=" + color + '}';
    }
    
    public boolean abrir(){
        System.out.println("EL libro ha abierto");
        return true;
    }
    
    public boolean cerrar(){
        System.out.println("El libro ha cerrado");
        return false;
    }
}
