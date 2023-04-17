public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + '}';
    }
    public void encender() {
        System.out.println("El vehículo ha sido encendido.");
    }
    
    public void apagar() {
        System.out.println("El vehículo ha sido apagado.");
    }
    
}

