package abstractas;
 public abstract class FiguraGeometrica{
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
    //Método estaticos
    public static double areaPromedio( FiguraGeometrica arr[]){
        double suma = 0;
        for(int i=0;i<arr.length;i++){
            suma = suma +arr[i].area();
        }
        return suma/arr.length;

    }
    //getter y setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}