import java.util.List;

public class Bebida extends Receta {
    private int tempServir;

    public Bebida(String nombre, int tiempo, int tempServir,
                  List<Ingrediente> ingredientes, List<String> pasos) {
        super(nombre, tiempo, ingredientes, pasos);
        this.tempServir = tempServir;
    }

    public int getTempServir() { return tempServir; }
    public void setTempServir(int tempServir) { this.tempServir = tempServir; }
}