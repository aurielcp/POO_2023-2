import java.awt.Color;
public class Gato {
    private Color color;
    private String edad;
    private String sexo;

    public Gato() {
    }

    public Gato(Color color, String edad, String sexo) {
        this.color = color;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void saltar(){
        System.out.println("El gato esta saltando");
    }
    
    public void dormir(){
        System.out.println("El gato esta durmiendo");
    }
}
