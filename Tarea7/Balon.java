import java.awt.Color;
public class Balon {
    private String deporte;
    private Color color;
    private String material;

    public Balon() {
    }

    public Balon(String deporte, Color color, String material) {
        this.deporte = deporte;
        this.color = color;
        this.material = material;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balon{" + "deporte=" + deporte + ", color=" + color + ", material=" + material + '}';
    }
    
    public void botar(){
        System.out.println("EL balon esta botando");
    }
    
    public void rodar(){
        System.out.println("El balon esta rodando");
    }
}
