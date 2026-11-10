package dia2;

import java.util.Scanner;

public class RebajaDiez {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para introducir datos
        Scanner teclado = new Scanner(System.in);

        // Pedimos el precio por teclado
        System.out.println("Introduce el precio del producto:");

        // Leemos el precio
        double precio = teclado.nextDouble();

        // Calculamos la rebaja del 10%
        double precioRebajado = precio - (precio * 0.10);

        // Mostramos el resultado
        System.out.println("El precio con rebaja del 10% es: " + precioRebajado);

        teclado.close();
    }
}