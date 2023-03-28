public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaCafe() {
    }

    public MaquinaCafe(int agua, int cafe, int crema) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" + "agua=" + agua + ", cafe=" + cafe + ", crema=" + crema + ", vasos=" + vasos + '}';
    }
    
    public void cafeAmericano(){
        
    }
    
    public void cafeExpreso(){
        
    }
    
    public void cafeCapuchino(){
        
    }
}

