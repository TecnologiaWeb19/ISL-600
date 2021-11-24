package array;
import java.util.Scanner;
public class Ejemplo_5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String nombres[] = new String[n];
        Llenar(n, nombres);
        Mostrar(n, nombres);
    }

    public static void Llenar(int n, String V[]) {
        for (int i = 0; i < n; i++) {
            V[i] = sc.next();
        }
    }

    public static void Mostrar(int n, String V[]) {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + V[i] + "]\t");
        }
    }

  
}
