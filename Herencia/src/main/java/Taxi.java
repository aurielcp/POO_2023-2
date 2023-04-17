public class Taxi extends Automovil{
    private String licencia;
    private boolean disponible;    

    public Taxi() {
    }

    public Taxi(String licencia, boolean disponible, int numPuertas, String tipoCombustible, String marca, String modelo, int año) {
        super(numPuertas, tipoCombustible, marca, modelo, año);
        this.licencia = licencia;
        this.disponible = disponible;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Taxi{" + "licencia=" + licencia + ", disponible=" + disponible + '}';
    }
    
    public void cobrarPasaje(){
        System.out.println("Recibiendo dinero...");
    }
    
    public void darCambio(){
        System.out.println("Dando Cambio...");
    }
}
