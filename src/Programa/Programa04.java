package Programa;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear arreglo para almacenar cinco nombres
        String[] nombres = new String[5];
        // Ingresar los cinco nombres
        System.out.println("Ingrese 5 nombres de personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        // Solicitar el nombre a buscar
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine();
        // Buscar el nombre en el arreglo
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {  // Ignora mayúsculas/minúsculas en la búsqueda
                encontrado = true;
                posicion = i;  // Almacenar la posición del nombre encontrado
                break;  // Detener la búsqueda cuando se encuentra el nombre
            }
        }
        // Mostrar resultados
        if (encontrado) System.out.println("La persona '" + nombreBuscado + "' existe en la posición " + (posicion + 1) + " del arreglo.");
        else  System.out.println("La persona '" + nombreBuscado + "' no existe en el arreglo.");
    }
}
