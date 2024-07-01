public class EmailClienteImpl implements EmailCliente {
    @Override
    public void enviarCorreo(String direccion, String mensaje) {
        // Simulamos el envío de un correo electrónico
        System.out.println("Enviando correo a " + direccion + " con el mensaje: " + mensaje);
    }
}
