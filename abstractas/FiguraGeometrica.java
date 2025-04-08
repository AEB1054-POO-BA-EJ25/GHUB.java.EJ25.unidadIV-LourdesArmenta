package abstractas;
public abstract class FiguraGeometrica{
    //Metodo abstracto
    public abstract double area();
    //metodo concreto
    public String toString(){
        return "area = "+area();
    }
    
}