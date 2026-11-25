
import java.util.ArrayList;

import java.util.Collections;

public class EjemploOrdenacionBasica {
    // Inicia el método principal
    public static void main(String[] args) {
        // Creamos la lista de textos desordenada
        ArrayList<String> nombres = new ArrayList<String>();
      
        nombres.add("Luis");
      
        nombres.add("Ana");
    
        nombres.add("Marta");
       
        nombres.add("Carlos");
       
        nombres.add("Manuel");

        nombres.add("Mario");

        System.out.println("Lista original desordenada: " + nombres);
        // ¡Magia en una línea! Ordena internamente el ArrayList de la A a la Z
        Collections.sort(nombres);
        // Encabezado para el bucle
        System.out.println("Lista ordenada de A a Z:");
        // Recorremos la lista ya ordenada
        for (int i = 0; i < nombres.size(); i++) {
            // Imprime en orden: Ana, Carlos, Luis, Marta
            System.out.println("-> " + nombres.get(i));
             // Cierra el bucle for
        }
        // Da la vuelta a la lista que ya estaba ordenada: queda de la Z a la A
        Collections.reverse(nombres);
        // Muestra: [Marta, Luis, Carlos, Ana]
        System.out.println("Lista ordenada de Z a A: " + nombres);
    // Cierra el método main
    }
// Cierra la clase EjemploOrdenacionBasica
}