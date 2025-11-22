import java.util.ArrayList;
import java.util.List;

public class LibroRecetas {

    private static LibroRecetas instance;
    private List<Receta> recetas;

    private LibroRecetas() {
        recetas = new ArrayList<>();
    }

    public static LibroRecetas getInstance() {
        if (instance == null) {
            instance = new LibroRecetas();
        }
        return instance;
    }

    public void agregarReceta(Receta r) {
        recetas.add(r);
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public Receta buscar(String nombre) {
        return recetas.stream()
                .filter(r -> r.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}