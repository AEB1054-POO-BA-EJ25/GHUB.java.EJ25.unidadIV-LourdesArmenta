package desacoplar;
public class MiAplicacionDeMensajes{
    public static void main(String[] args) {
        
        Comunicador t1 = new TelefonoCelular();
        Comunicador t2 = new PalomaMensajera();
        Comunicador t3 = new Telegrafo();

        t3.enviarMensaje("mensaje");
        t2.enviarMensaje("mensaje");
        t1.enviarMensaje("mensaje");

        Comunicador c = ComunicadorManager.crearComunicador();
        c.enviarMensaje("Hola, este es mi mensaje");

        
        
    }
}