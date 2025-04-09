package abstractas;
 abstract class FiguraGeometrica{
    //atributos
    protected double x;
    protected double y;
    protected String nombre;
    //constructores

    public FiguraGeometrica(){
        this.x = 0;
        this.y = 0;
    }
    public FiguraGeometrica(double x, double y){
        this.x = x;
        this.y = y;
        
    }

    public FiguraGeometrica(String nom){
        nombre = nom;

    }
    //Metodo abstracto
    public abstract double area();
    //metodo concreto
    public String toString(){
        return nombre+" area = "+area();
    }
    //getter y setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}