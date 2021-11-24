package array;
public class Estudiante extends Persona{
    private String matricula;
    private String semestre;
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    public void Mostrar(){
        System.out.println("Matricula es: "+matricula);
        System.out.println("Semestre es: "+semestre);
        System.out.println("CI es: "+getCi());
        System.out.println("Nombres es: "+getNombres());
        System.out.println("Apellidos es: "+getApellido());
        System.out.println("Edad es: "+getEdad());
        System.out.println("Genero es: "+getGenero());
    }       
}
