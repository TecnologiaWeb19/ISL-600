package array;
import java.util.Scanner;
public class Ejemplo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int V[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[" + V[i] + "]\t");
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (V[i] % 2 == 0) {
                suma = suma + V[i];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}

