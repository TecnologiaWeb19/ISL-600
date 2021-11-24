package array;
import java.util.Scanner;
public class Ejemplo_4 {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int V[] = new int[n];
        Llenar(n, V);
        Mostrar(n, V);
        Sumar(n, V);
    }

    public static void Llenar(int n, int V[]) {
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }
    }

    public static void Mostrar(int n, int V[]){
        for (int i = 0; i < n; i++) {
            System.out.print("[" + V[i] + "]\t");
        }        
    }
    
    public static void Sumar(int n, int V[]){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (V[i] % 2 == 0) {
                suma = suma + V[i];
            }
        }
        System.out.println("La suma es: " + suma);
    }
}
