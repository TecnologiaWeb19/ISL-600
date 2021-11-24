package array;
public class Persona {
    private String nombres;
    private String apellido;
    private int ci;
    private int edad;
    private char genero;
    //Constructor
    public Persona() {
    }
    //Get y Set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    //Metodos
    public void Mostrar(){
        System.out.println("CI es: "+ci);
        System.out.println("Nombres es: "+nombres);
        System.out.println("Apellidos es: "+apellido);
        System.out.println("Edad es: "+edad);
        System.out.println("Genero es: "+genero);
    }
}
