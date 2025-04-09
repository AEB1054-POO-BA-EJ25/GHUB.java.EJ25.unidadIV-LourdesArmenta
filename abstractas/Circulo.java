package abstractas;
public class Circulo extends FiguraGeometrica{
    //atributos
    private double radio;
    //constructores
    public Circulo(){

    }
    public Circulo(double r){
        super("Circulo");
        radio = r;
    }
    //metodos personalizados

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

}
