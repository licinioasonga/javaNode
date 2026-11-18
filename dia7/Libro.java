
package dia7;

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // 1. Constructor vacío
    public Libro() {
        this("Sin título", "Desconocido", 0);
    }

    // 2. Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 3. Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("==============");
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("==============");
    }

}
