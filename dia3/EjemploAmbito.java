package dia3;

// Define la clase para comprender dónde nacen y mueren las variables (archivo
// EjemploAmbito.java)
public class EjemploAmbito {
    // Abre el bloque general del método main
    public static void main(String[] args) {
        // Como 'consumo' se declara en el main, existe y es visible durante todo
        // el programa
        double consumo = 120.0;
        // Declaramos también la caja 'precio' aquí fuera para que siga existiendo
        // cuando termine el if-else
        double precio;
        // Primer tramo de tarifa según el consumo
        if (consumo <= 50) {
            // Rellenamos la variable 'precio' que ya habíamos creado arriba antes
            // del if
            precio = 10.0;
            // Segundo tramo de tarifa
        } else if (consumo <= 100) {
            // Asignamos 18.0 a la misma variable 'precio'
            precio = 18.0;
            // Tercer tramo para consumos superiores a 100
        } else {
            // Asignamos 25.0 a 'precio'
            precio = 25.0;
            // Aquí se cierra el if-else, pero como 'precio' nació antes del if,
            // conserva su valor intacto
        }
        // Podemos imprimir 'precio' sin error porque fue declarada fuera del if
        System.out.println("El importe de tu tarifa es: " + precio + " euros.");
        // Cierra el método main
    }
    // Cierra la clase EjemploAmbito
}