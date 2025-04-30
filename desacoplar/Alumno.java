package desacoplar;



public class Alumno implements Comparable<Alumno> {
    //Atributo
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    //Constructor

    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    //propiedades
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double getNotaPromedio() {
        return notaPromedio;
    }


    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }


    public int compareTo(Alumno otroAlumno){
        return this.edad -otroAlumno.edad;

    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + notaPromedio ;
    }

    
    
}
