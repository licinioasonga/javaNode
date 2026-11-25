
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5ListaOrdenada {

    public static void main(String[] args) {

        // Creamos una lista de nombres
        ArrayList<String> ciudades = new ArrayList<>();

        // Añadimos 5 ciudades
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Malaga");
        ciudades.add("Valencia");

        // Ordenamos alfabeticamente
        
        Collections.sort(ciudades);

        Collections.reverse(ciudades);

        // Mostramos la lista con un bucle for
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }
    }
}
