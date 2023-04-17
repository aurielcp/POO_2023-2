public class Automovil extends Vehiculo{
    private int numPuertas;
    private String tipoCombustible; 

    public Automovil() {
    }

    public Automovil(int numPuertas, String tipoCombustible, String marca, String modelo, int año) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automovil{" + "numPuertas=" + numPuertas + ", tipoCombustible=" + tipoCombustible + '}';
    }
    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }
    
    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }    
}
