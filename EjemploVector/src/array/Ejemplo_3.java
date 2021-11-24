package array;
import java.util.Scanner;
public class Ejemplo_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Tamaño del Vector");
        int n = sc.nextInt();
        int V[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese Elemento del Vector");
            V[i] = sc.nextInt();
        }
        
        System.out.println("--------------LOS ELEMENTOS DEL VECTOR SON----------------");

        for (int i = 0; i < n; i++) {
            System.out.print("[" + V[i] + "]\t");
        }
        System.out.println("--------------LA SUMA DE ELEMENTOS PARES SON----------------");
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (V[i] % 2 == 0) {
                suma = suma + V[i];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
