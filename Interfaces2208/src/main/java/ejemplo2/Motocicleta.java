package ejemplo2;

public class Motocicleta implements Vehiculo{
    private int centimetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "centimetrosCubicos=" + centimetrosCubicos + ", marca=" + marca + '}';
    }
    
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta: " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta: " + this.marca);
        return true;
    }

    @Override
    public boolean avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimetrosCubicos + "cc");
        return false;
    }

    @Override
    public boolean frenar() {
        System.out.println("Frenando la motocicleta: " + this.marca);
        return false;
    }
}
