package miPrincipal;
import fecha.*;

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

        
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }





        

        
        
    }
}