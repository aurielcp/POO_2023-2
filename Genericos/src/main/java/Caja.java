public class Caja<T> {
    private static final int CPACIDAD = 10;
    
    private T[] content;

    public Caja() {
    }

    public Caja(T[] content) {
        this.content = content;
    }
    
    public void add(int pos, T objeto){
        content[pos] = objeto;
    }
    
    public T get(int pos){
        return content[pos];
    }
}
