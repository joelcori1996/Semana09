package Programa;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        double[] pesos = new double[n];  // Crear arreglo para almacenar los pesos
        double sumaPesos = 0;            // Variable para acumular la suma de los pesos
        // Registrar los pesos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            sumaPesos += pesos[i];  // Acumular los pesos
        }
        // Calcular el promedio
        double promedioPeso = sumaPesos / n;
        // Mostrar el peso promedio
        System.out.println("El peso promedio de las personas es: " + promedioPeso);
    }
}
