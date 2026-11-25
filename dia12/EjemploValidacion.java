public class EjemploValidacion {
    // Inicia el programa
    public static void main(String[] args) {
        // Unidades disponibles actualmente en nuestro almacén
        int stock = 10;
        // Unidades que el cliente intenta comprar
        int cantidadSolicitada = 8;
        // Prevenimos el problema antes de restar usando un simple condicional if
        if (cantidadSolicitada > stock) {
            // Aviso limpio de regla de negocio
            System.out.println("No hay suficiente stock en el almacén.");
        // Si hay stock suficiente:
        } else {
            // Procesa el pedido
            System.out.println("Pedido aceptado correctamente.");
        // Cierra el condicional if-else
        }
    // Cierra el método main
    }
// Cierra la clase EjemploValidacion
}