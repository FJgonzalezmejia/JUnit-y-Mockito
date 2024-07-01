public class Main {
    public static void main(String[] args) {
        // Crear una instancia de EmailCliente
        EmailCliente emailCliente = new EmailClienteImpl();

        // Crear una instancia de NotificadorEmail con el EmailCliente
        NotificadorEmail notificador = new NotificadorEmail(emailCliente);

        // Enviar un correo de prueba
        try {
            notificador.notificar("ejemplo@test.com", "Hola Mundo");
            notificador.notificar("", "Este correo no se enviará y generará una excepción");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Otro ejemplo con mensaje nulo
        try {
            notificador.notificar("ejemplo@test.com", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
