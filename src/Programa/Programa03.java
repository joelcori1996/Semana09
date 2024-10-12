package Programa;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt();
        double[] compras = new double[n];  // Crear arreglo para almacenar las compras
        double sumaCompras = 0;            // Variable para acumular el total de las compras
        double compraMayor = Double.MIN_VALUE;  // Inicializar con el valor más bajo posible
        double compraMenor = Double.MAX_VALUE;  // Inicializar con el valor más alto posible
        // Registrar las compras
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            sumaCompras += compras[i];  // Acumular el total de compras
            // Verificar si la compra actual es la mayor
            if (compras[i] > compraMayor)compraMayor = compras[i]; 
            // Verificar si la compra actual es la menor
            if (compras[i] < compraMenor)compraMenor = compras[i]; 
        }
        // Calcular el promedio de las compras
        double promedioCompras = sumaCompras / n;
        // Mostrar el total, promedio, compra mayor y compra menor
        System.out.println("\nTotal de las compras: " + sumaCompras);
        System.out.println("Promedio de las compras: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}
