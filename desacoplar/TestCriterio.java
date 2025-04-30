package desacoplar;
public class TestCriterio{
    public static void main(String [] args){
        Alumno arr[] = {new Alumno("Martin",25,4.2),
                        new Alumno("Carlos",23,5.1),
                        new Alumno("Anastacio",20,4.8)};
        Util.ordenar(arr, new CriterioAlumnoNotaProm());
        Util.imprimir(arr);

        Util.ordenar(arr, new CriterioAlumnoNombre());
        Util.imprimir(arr);


    }
    
}
