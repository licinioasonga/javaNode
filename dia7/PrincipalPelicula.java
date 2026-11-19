
package dia7;

public class PrincipalPelicula {

    public static void main(String[] args) {

        // Creamos dos películas
        Pelicula pelicula1 = new Pelicula("Avatar", 162, 12);

        Pelicula pelicula2 = new Pelicula("Buscando a Nemo", 100);

        // Mostramos sus fichas
        pelicula1.mostrarFicha();

        pelicula2.mostrarFicha();

        // Comprobamos si una persona puede ver la película
        int edadPersona = 10;

        System.out.println("\n¿Puede ver Avatar una persona de "
                + edadPersona + " años?");

        if (pelicula1.puedeVer(edadPersona)) {
            System.out.println("Sí, puede verla.");
        } else {
            System.out.println("No, no puede verla.");
        }
    }
}
