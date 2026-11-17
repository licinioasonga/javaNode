package dia6;

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // Setter para asignar el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Setter para asignar el autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Setter para asignar el número de páginas
    public void setPaginas(int paginas) {
        if (paginas > 0) {
            this.paginas = paginas;
        }
    }

    // Método para mostrar la ficha del libro
    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
        System.out.println("--------------------------");
    }
}
