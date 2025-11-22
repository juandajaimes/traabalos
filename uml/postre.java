import java.util.List;

public class Postre extends Receta {
    private int nivelDulce;

    public Postre(String nombre, int tiempo, int nivelDulce,
                  List<Ingrediente> ingredientes, List<String> pasos) {
        super(nombre, tiempo, ingredientes, pasos);
        this.nivelDulce = nivelDulce;
    }

    public int getNivelDulce() { return nivelDulce; }
    public void setNivelDulce(int nivelDulce) { this.nivelDulce = nivelDulce; }
}