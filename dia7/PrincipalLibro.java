
package dia7;

public class PrincipalLibro {

    public static void main(String[] args) {

        // Creamos un libro utilizando el constructor vacío
        Libro libro1 = new Libro();

        // Creamos otro libro utilizando el constructor completo
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 863);

        // Mostramos los datos
        libro1.mostrarDatos();
        libro2.mostrarDatos();

    }
}
