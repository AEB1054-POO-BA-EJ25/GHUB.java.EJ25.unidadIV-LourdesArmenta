package genericidad;
public class Caja<T>{
    //atributos
    private T contenido;

    //propiedades
    public T getContenido(){
        return contenido;
    }

    public void setContenido(T contenido){
        this.contenido = contenido;

    }

    @Override
    public String toString(){
        return "Caja Contiene: "+contenido;
    }

}