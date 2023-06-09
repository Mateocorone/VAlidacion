import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la medicina: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad de la medicina: ");
        int cantidad = scanner.nextInt();
        inventario.agregarMedicina(nombre, cantidad);
    }
}