import java.util.List;

public class PlatoFuerte extends Receta {
    private int nivelSal;

    public PlatoFuerte(String nombre, int tiempo, int nivelSal,
                       List<Ingrediente> ingredientes, List<String> pasos) {
        super(nombre, tiempo, ingredientes, pasos);
        this.nivelSal = nivelSal;
    }

    public int getNivelSal() { return nivelSal; }
    public void setNivelSal(int nivelSal) { this.nivelSal = nivelSal; }
}