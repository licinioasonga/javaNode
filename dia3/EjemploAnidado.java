package dia3;

public class EjemploAnidado {
    // Punto de arranque del programa
    public static void main(String[] args) {
        // Guardamos la edad del ciudadano
        int edad = 19;
        // Guardamos si dispone del permiso de conducir en vigor
        boolean tieneCarnet = false;
        // Primera barrera: comprobamos primero si es mayor de edad
        if (edad >= 18) {
            // Segunda barrera (solo se pregunta si ya superó la primera): ¿tiene
            // además carnet de conducir?
            if (tieneCarnet) {
                // Se muestra si es mayor de edad Y tiene carnet
                System.out.println("Cumple todo: puede alquilar y conducir el " +
                        "vehículo.");
                // Pertenece al segundo if: sabemos que sí tiene 18 años o más, pero
                // le falta el carnet
            } else {
                // Mensaje específico indicando qué requisito falló
                System.out.println("Es mayor de edad, pero no puede conducir " +
                        "sin carnet.");
                // Cierra el if-else interno
            }
            // Pertenece al primer if exterior: ni siquiera llegó a cumplir los 18
            // años
        } else {
            // Rechaza directamente sin necesidad de preguntar por el carnet
            System.out.println("Acceso denegado: no es mayor de edad.");
            // Cierra el if-else externo
        }
        // Cierra el método main
    }
    // Cierra la clase EjemploAnidado
}
