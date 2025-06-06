package miPrincipal;
import fecha.*;
import abstractas.Circulo;
import abstractas.Rectangulo;
import abstractas.Triangulo;
import abstractas.FiguraGeometrica;
import genericidad.Caja;
import genericidad.Utilidades;

public class Principal {
   

    public static void main(String[] args) {

        Animal animales[] = new Animal[5];
        animales[0]= new Animal();
        animales[1]= new Perro();
        animales[2]= new Gato();
        animales[3]= new Pajaro();
        animales[4]= new Animal();

        Animal animal1 = new Animal();
        Perro perro1 = new Perro();
        animal1 = perro1;
        //perro1 = animal1; // no es posible
        perro1 = (Perro)animal1; //conversion explicita;
        for (int i=0; i<animales.length;i++){
            animales[i].hacerSonido();
        }

        Fecha fec = new FechaDetallada(25,02,2009); //polimorfismo

        Object obj = new FechaDetallada(3,12,2008);

        System.out.println("fec="+fec);
        System.out.println("obj="+obj);

        Object[] arr ={ new Fecha(2,10,1970)
                       ,new FechaDetallada(23,12,1948)
                       ,new String("Esto es una cadena")
                       ,new Integer(34)
                    };
        MuestraConjunto.mostrar(arr);

        //uso del paquete abstractas

        abstractas.Perro perro2 = new  abstractas.Perro();
        perro2.hacerSonido();

        abstractas.Gato gato2 = new  abstractas.Gato();
        gato2.hacerSonido();

       // abstractas.Animal a = new abstractas.Animal();// Esto no es posible
       
       //probamos clases derivada de la abstracta

       Circulo c = new Circulo(4.0);

       Rectangulo r = new Rectangulo(10.5,5.1);

       Triangulo t = new Triangulo(3.0,6.0);

       

       System.out.println(c);
       System.out.println(r);
       System.out.println(t);

       FiguraGeometrica arreglo2[]={ c, r,t};

       double prom = FiguraGeometrica.areaPromedio(arreglo2);

       System.out.println("Promedio ="+prom);

       //Utilizando genericidad
       Caja<String> miCaja = new Caja<>();
       miCaja.setContenido("Luisa");
       System.out.println(miCaja);

       Caja<Integer> miCaja2 = new Caja<>();
       miCaja2.setContenido(5);
       System.out.println(miCaja2);

       Caja<Double> miCaja3 = new Caja<>();
       miCaja3.setContenido(3.1416);
       System.out.println(miCaja3);

       //uso de metodos genericos

       Integer [] arregloEnteros = {5,7,90,14,10};
       Utilidades.imprimirArra(arregloEnteros);

       String [] arregloString = {"Lucia","Juan","Pedro"};
       Utilidades.imprimirArra(arregloString);
       






       
  
        
    }
}