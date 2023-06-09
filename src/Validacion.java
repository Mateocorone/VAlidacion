import java.util.Map;
public class Validacion{
    public static boolean validarMedicina(String nombre, Map<String, Integer> inventario) {
        if (inventario.containsKey(nombre)) {
            System.out.println("Error: la medicina ya existe en el inventario.");
            return false;
        } else {
            return true;
        }
    }
}
