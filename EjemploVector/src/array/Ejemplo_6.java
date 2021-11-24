package array;

import java.util.Scanner;

public class Ejemplo_6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String nombres[] = new String[n];
        int cantidad[] = new int[n];
        Llenar(n, nombres);
        Mostrar(n, nombres);
        Llenar(n, cantidad, nombres);
        System.out.println("");
        Mostrar(n, cantidad);
    }

    public static void Llenar(int n, int V[], String nom[]) {
        for (int i = 0; i < n; i++) {
            V[i] = nom[i].length();
        }
    }

    public static void Mostrar(int n, int V[]){
        for (int i = 0; i < n; i++) {
            System.out.print("[" + V[i] + "]\t");
        }        
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
