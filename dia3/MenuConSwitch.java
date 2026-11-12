package dia3;

// Define la clase para gestionar un menú de opciones cerradas (archivo
// MenuConSwitch.java)
public class MenuConSwitch {
    // Inicia el método principal
    public static void main(String[] args) {
        // Simulamos que el usuario ha elegido la opción número 2 del menú
        int opcion = 1;
        // Indicamos entre paréntesis qué variable queremos examinar (en este caso
        // 'opcion')
        switch (opcion) {
            // En caso de que 'opcion' valga exactamente 1, entra por aquí:
            case 1:
                // Ejecuta la acción correspondiente al caso 1
                System.out.println("Has seleccionado: Alta de nuevo usuario.");
                // ¡FUNDAMENTAL! 'break' frena la ejecución y sale del switch para
                // no ejecutar por accidente los casos de abajo
                break;
            // En caso de que 'opcion' valga exactamente 2, salta directamente
            // aquí:
            case 2:
                // Ejecuta la acción correspondiente al caso 2
                System.out.println("Has seleccionado: Baja de usuario en el " +
                        "sistema.");
                // Frena y sale del bloque switch tras haber cumplido su misión
                break;
            // En caso de que 'opcion' valga exactamente 3:
            case 3:
                // Muestra el mensaje de la opción 3
                System.out.println("Has seleccionado: Consulta de datos de " +
                        "cliente.");
                // Detiene el flujo y sale del switch
                break;
            // Caso por defecto (funciona igual que el 'else' final): entra aquí
            // si 'opcion' no coincide con ningún case (ej. si vale 9)
            default:
                // Informa al usuario de que ha pulsado un número inexistente
                System.out.println("Error: La opción seleccionada no es válida.");
                // Cierra el bloque completo del switch
        }
        // Cierra el método main

    }
}