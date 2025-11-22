import java.util.List;

public class RecetaFactory {

    public Receta crearReceta(
            String tipo,
            String nombre,
            int tiempo,
            List<Ingrediente> ing,
            List<String> pasos,
            int atributoExtra
    ) {
        switch (tipo.toLowerCase()) {
            case "postre":
                return new Postre(nombre, tiempo, atributoExtra, ing, pasos);
            case "platofuerte":
                return new PlatoFuerte(nombre, tiempo, atributoExtra, ing, pasos);
            case "bebida":
                return new Bebida(nombre, tiempo, atributoExtra, ing, pasos);
            default:
                throw new IllegalArgumentException("Tipo de receta no válido.");
        }
    }
}