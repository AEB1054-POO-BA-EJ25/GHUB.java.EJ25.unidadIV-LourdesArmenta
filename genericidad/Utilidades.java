package genericidad;
public class Utilidades{
    //Metodo generico
    public static <T> void imprimirArra( T[] array){
        for (T elemento: array){
            System.out.print(elemento+" ");

        }
        System.out.println();


    }

}