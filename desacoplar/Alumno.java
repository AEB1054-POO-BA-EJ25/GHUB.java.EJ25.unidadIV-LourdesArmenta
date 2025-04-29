package desacoplar;



public class Alumno implements Comparable<Alumno> {
    private int edad;

    public int compareTo(Alumno otroAlumno){
        return this.edad = otroAlumno.edad;

    }
    
}
