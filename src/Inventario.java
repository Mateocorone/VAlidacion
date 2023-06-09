import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> medicinas;

    public Inventario() {
        medicinas = new HashMap<String, Integer>();
    }

    public void agregarMedicina(String nombre, int cantidad) {
        if (Validacion.validarMedicina(nombre, medicinas)) {
            medicinas.put(nombre, cantidad);
        }
    }

}