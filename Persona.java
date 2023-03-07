class Persona {
    private int edad;
    private String nombre;
    double estatura;

    public Persona(){
    }

    public Persona(int edad, String nombre, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", estatura=" + estatura + '}';
    }
    
    
    
    public void comer(){
        System.out.println("La persona " + nombre + "esta comiendo");
    }
    
    public void tomar(){
        System.out.println("La persona " + nombre + "esta comiendo");
    }
    
    public void bañar(){
        System.out.println("La persona " +  nombre + "esta durmiendo");
    }    
}
