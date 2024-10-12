package Programa;
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declarar los arreglos
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];  // Arreglo para almacenar los valores intercalados
        // Ingresar los valores del arreglo a
        System.out.println("Ingrese 5 numeros para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        // Ingresar los valores del arreglo b
        System.out.println("\nIngrese 5 numeros para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }
        // Intercalar los valores de a y b en el arreglo c
        int j = 0;
        for (int i = 0; i < 5; i++) {
            c[j++] = a[i];  // Agregar valor de a en c
            c[j++] = b[i];  // Agregar valor de b en c
        }
        // Mostrar los valores intercalados del arreglo c
        System.out.println("\nValores intercalados del arreglo c:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
         System.out.println("\n");    
    }
}
