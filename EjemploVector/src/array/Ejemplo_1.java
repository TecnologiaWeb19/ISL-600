package array;
import java.util.Scanner;

public class Ejemplo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V[] = new int[6];
        
        for (int i = 0; i < 6; i++) {
            V[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.print("["+V[i]+"]\t");
        }
        int suma=0;
        for (int i = 0; i < 6; i++) {
            if(V[i] % 2 == 0){
                suma = suma + V[i];
            }
        }
        System.out.println("La suma es: "+suma);
    }
}
