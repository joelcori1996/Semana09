package Programa;
import java.util.Scanner;
public class Programa02 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        double[] ingresos = new double[n];// Crear arreglo para almacenar los ingresos
        double sumaIngresos = 0;          // Variable para acumular la suma de los ingresos
        double ingresoMayor = 0;          // Variable para almacenar el ingreso mayor
        // Registrar los ingresos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i];  // Acumular los ingresos
            // Verificar si el ingreso actual es el mayor
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        // Calcular el ingreso promedio
        double ingresoPromedio = sumaIngresos / n;
        // Mostrar el ingreso promedio y el ingreso mayor
        System.out.println("\nEl ingreso promedio de las personas es: " + ingresoPromedio);
        System.out.println("El ingreso mayor registrado es: " + ingresoMayor);

    }
}
