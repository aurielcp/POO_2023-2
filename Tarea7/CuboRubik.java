public class CuboRubik {
    private String marca;
    private String tamaño;
    private int precio;

    public CuboRubik() {
    }

    public CuboRubik(String marca, String tamaño, int precio) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CuboRubik{" + "marca=" + marca + ", tama\u00f1o=" + tamaño + ", precio=" + precio + '}';
    }
    
    public void girarColumna(){
        System.out.println("El cubo giro una Columna");
    }
    
    public void girarFila(){
        System.out.println("El cubi giro una Fila");
    }
}
