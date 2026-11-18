
package dia7;

public class Alumno {

    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Alumno(String nombre, int edad) {
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
        System.out.println("Datos del Alumno");
        System.out.println("=================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("-----------------");
    }
}
