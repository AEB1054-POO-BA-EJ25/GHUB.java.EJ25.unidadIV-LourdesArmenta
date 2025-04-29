package desacoplar;
public class Telegrafo extends Reliquia implements Comunicador{
    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("El telegrafo envia un mensaje: "+mensaje);

    }
}
