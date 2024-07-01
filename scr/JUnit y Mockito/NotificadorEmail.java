public class NotificadorEmail {
    private final EmailCliente emailCliente;

    public NotificadorEmail(EmailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void notificar(String direccion, String mensaje) {
        if (direccion != null && !direccion.isEmpty() && mensaje != null) {
            emailCliente.enviarCorreo(direccion, mensaje);
        } else {
            throw new IllegalArgumentException("La dirección y el mensaje no pueden ser nulos o vacíos");
        }
    }
}
