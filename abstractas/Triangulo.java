package abstractas;
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    //constructores
    public Triangulo(){

        super();

    }
    public Triangulo(double b,double h){
        super("Triangulo");
        base = b;
        altura = h;
    }
    public Triangulo(double x, double y,double b,double h ){
        super(x,y);
        base = b;
        altura = h;

    }

    //personalizado
    public double area(){
        return base*altura/2;
    }
}