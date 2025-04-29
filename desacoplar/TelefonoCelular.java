package desacoplar;
public class TelefonoCelular extends Telefono implements Comunicador{
    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("El telefono celular envia un mensaje: "+mensaje);

    }
}