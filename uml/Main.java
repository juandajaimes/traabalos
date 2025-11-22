import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibroRecetas libro = LibroRecetas.getInstance();

        List<Ingrediente> ingPostre = new ArrayList<>();
        ingPostre.add(new Ingrediente("Harina", 200, "g"));
        ingPostre.add(new Ingrediente("Azúcar", 100, "g"));

        List<Ingrediente> ingPlato = new ArrayList<>();
        ingPlato.add(new Ingrediente("Pollo", 1, "unidad"));

        List<Ingrediente> ingBebida = new ArrayList<>();
        ingBebida.add(new Ingrediente("Agua", 500, "ml"));

        List<String> pasos = List.of("Mezclar", "Cocinar", "Servir");

        RecetaFactory factory = new RecetaFactory();

        Receta pastel = factory.crearReceta("postre", "Pastel", 45, ingPostre, pasos, 7);
        Receta pollo = factory.crearReceta("platofuerte", "Pollo Asado", 60, ingPlato, pasos, 5);
        Receta limonada = factory.crearReceta("bebida", "Limonada", 5, ingBebida, pasos, 4);

        libro.agregarReceta(pastel);
        libro.agregarReceta(pollo);
        libro.agregarReceta(limonada);

        System.out.println("Recetas en el libro:");
        for (Receta r : libro.getRecetas()) {
            System.out.println("- " + r.getNombre());
        }
    }
}
