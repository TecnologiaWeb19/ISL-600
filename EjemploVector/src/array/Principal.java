package array;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante chicas[] = new Estudiante[6];
        
        
        for (int i = 0; i < 3; i++) {
            Estudiante e = new Estudiante();
            System.out.println("Ingrese Matricula");
            e.setMatricula(sc.nextLine());
            System.out.println("Semestre");
            e.setSemestre(sc.nextLine());
            System.out.println("Nombres");
            e.setNombres(sc.nextLine());
            System.out.println("Apellidos");
            e.setApellido(sc.nextLine());
            System.out.println("Edad");
            e.setEdad(sc.nextInt());
            //e.setGenero(sc.next());
            chicas[i] = e;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Su Matricula es: "+chicas[i].getMatricula());
            System.out.println("Su Semestre es: "+chicas[i].getSemestre());
            System.out.println("Su Nombre es: "+chicas[i].getNombres());
            System.out.println("Su Apellido es: "+chicas[i].getApellido());
            System.out.println("Su Edad es: "+chicas[i].getEdad());
        }
    }
}
