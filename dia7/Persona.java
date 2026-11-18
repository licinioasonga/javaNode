
package dia7;

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public int getEdad() {
        return edad;
    }

    // Setter
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Datos de la Persona");
        System.out.println("=================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("-----------------");
    }
}
