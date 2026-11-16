package dia5;

import java.util.Scanner;

public class PrecioMaximoMinimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1. Crear un array para guardar 6 precios
        double[] precios = new double[6];

        // 2. Introducir los precios por teclado
        for (int i = 0; i < precios.length; i++) {

            System.out.print("Introduce el precio del producto " + (i + 1) + ": ");
            precios[i] = teclado.nextDouble();
        }

        // 3. Inicializar máximo y mínimo
        double maximo = precios[0];
        double minimo = precios[0];

        // 4. Recorrer el array para buscar máximo y mínimo
        for (int i = 0; i < precios.length; i++) {

            if (precios[i] > maximo) {
                maximo = precios[i];
            }

            if (precios[i] < minimo) {
                minimo = precios[i];
            }
        }

        // 5. Mostrar resultados
        System.out.println("--------------------------");
        System.out.println("El precio más caro es: " + maximo + " €");
        System.out.println("El precio más barato es: " + minimo + " €");

        teclado.close();
    }
}
