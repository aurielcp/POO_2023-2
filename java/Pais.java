public class Pais {
    private String nombre;
    private String idioma;
    private String continente;

    public Pais() {
    }

    public Pais(String nombre, String idioma, String continente) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", idioma=" + idioma + ", continente=" + continente + '}';
    }

    public void formaGobierno(){
        System.out.println("La forma de gobierno de " +  nombre + "es: ");
    }
    
    public void economia(){
        System.out.println("La economia de " + "es: ");
    }
}
