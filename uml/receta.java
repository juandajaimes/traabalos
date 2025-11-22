import java.util.List;

public class Receta {
    protected String nombre;
    protected int tiempoPreparacion;
    protected List<Ingrediente> ingredientes;
    protected List<String> pasos;

    public Receta(String nombre, int tiempoPreparacion,
                  List<Ingrediente> ingredientes, List<String> pasos) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public String getNombre() { return nombre; }
    public int getTiempoPreparacion() { return tiempoPreparacion; }
    public List<Ingrediente> getIngredientes() { return ingredientes; }
    public List<String> getPasos() { return pasos; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTiempoPreparacion(int tiempo) { this.tiempoPreparacion = tiempo; }
    public void setIngredientes(List<Ingrediente> ingredientes) { this.ingredientes = ingredientes; }
    public void setPasos(List<String> pasos) { this.pasos = pasos; }
}