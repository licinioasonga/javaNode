package dia2;

// Define la clase para evaluar múltiples requisitos con operadores lógicos
public class Condicionescompuestas {
 // Inicia el método principal
  public static void main(String[] args) {

        // Guarda la calificación obtenida por el alumno
        double nota = 6.5;

        // Guarda el porcentaje de asistencia
        int asistencia = 85;

        // Comprueba si supera la nota y la asistencia
        boolean aprueba = (nota >= 5) && (asistencia >= 80);

        // Comprueba si suspende la nota o la asistencia
        boolean recupera = (nota < 5) || (asistencia < 80);

        // Muestra los resultados
        System.out.println("¿Supera el módulo?: " + aprueba);
        System.out.println("¿Debe ir a recuperación?: " + recupera);

    }
}