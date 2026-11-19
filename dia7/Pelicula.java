
package dia7;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;

    // Constructor principal
    public Pelicula(String titulo, int duracion, int edadMinima) {

        this.titulo = titulo;

        if (duracion <= 0) {
            System.out.println("Aviso: duración incorrecta. Se asignan 90 minutos.");
            this.duracion = 90;
        } else {
            this.duracion = duracion;
        }

        if (edadMinima < 0 || edadMinima > 18) {
            System.out.println("Aviso: edad mínima incorrecta. Se asignan 18 años.");
            this.edadMinima = 18;
        } else {
            this.edadMinima = edadMinima;
        }
    }

    // Constructor sobrecargado
    public Pelicula(String titulo, int duracion) {
        this(titulo, duracion, 0);
    }

    // Comprueba si una persona puede ver la película
    public boolean puedeVer(int edad) {
        return edad >= edadMinima;
    }

    // Convierte la duración en horas y minutos
    public String getDuracionTexto() {

        int horas = duracion / 60;
        int minutos = duracion % 60;

        return horas + "h " + minutos + "min";
    }

    // Muestra la ficha de la película
    public void mostrarFicha() {

        String calificacion;

        if (edadMinima == 0) {
            calificacion = "Todos los públicos";
        } else {
            calificacion = "No recomendada para menores de " 
                           + edadMinima + " años";
        }

        System.out.println("\nDATOS DE LA PELÍCULA");
        System.out.println("==============================");
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + getDuracionTexto());
        System.out.println("Edad mínima: " + edadMinima + " años");
        System.out.println("Calificación: " + calificacion);
        System.out.println("==============================");
    }
}
