package tablamvc;

public class Videojuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoEnGb;
    private String plataforma;
    private String desarollador;

    public Videojuego() {
    }

    public Videojuego(int id, String nombre, String genero, double pesoEnGb, String plataforma, String desarollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoEnGb = pesoEnGb;
        this.plataforma = plataforma;
        this.desarollador = desarollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPesoEnGb() {
        return pesoEnGb;
    }

    public void setPesoEnGb(double pesoEnGb) {
        this.pesoEnGb = pesoEnGb;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarollador() {
        return desarollador;
    }

    public void setDesarollador(String desarollador) {
        this.desarollador = desarollador;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", pesoEnGb=" + pesoEnGb + ", plataforma=" + plataforma + ", desarollador=" + desarollador + '}';
    }
    
}
