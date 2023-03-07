import java.awt.Color;
class Automovil {

    private String marca;
    private String subMarca;
    private byte modelo;
    private Color color;
    
    public Automovil(String marca, String subMarca, byte modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }

    public boolean encender(){
        System.out.println("El auto: " + marca + "esta encendido");
        return true;
    }
    
    public boolean apagar(){
        System.out.println("El auto: " + marca + "esta apagado");
        return false;
    }
    
    public void acelerar(){
        System.out.println("El auto " + marca + "esta acelerando");
    }
}
