package dia6;


public class PrincipalLibro {

    public static void main(String[] args) {

        // Crear el primer libro
        Libro libro1 = new Libro();

        libro1.setTitulo("Don Quijote de la Mancha");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setPaginas(863);

        // Crear el segundo libro
        Libro libro2 = new Libro();

        libro2.setTitulo("Cien años de soledad");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setPaginas(471);

        // Mostrar la ficha de los dos libros
        System.out.println("=== FICHA DEL LIBRO 1 ===");
        libro1.mostrarFicha();

        System.out.println("=== FICHA DEL LIBRO 2 ===");
        libro2.mostrarFicha();

    }
}
