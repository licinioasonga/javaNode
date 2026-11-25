
public class Ejercicio2ValidarEdad {

    // Metodo para comprobar la edad
    public static void comprobarEdad(int edad) {

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        System.out.println("Edad valida: " + edad);
    }

    public static void main(String[] args) {

        // Probamos una edad valida
        try {
            comprobarEdad(17);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probamos una edad negativa
        try {
            comprobarEdad(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
