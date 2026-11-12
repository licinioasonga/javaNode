
package dia3;

import java.util.Scanner;

public class DescuentoPorTramos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio del producto:");
        double precio = sc.nextDouble();

        double descuento;

        if (precio < 50) {
            // No tiene descuento
            descuento = 0;

        } else if (precio < 100) {
            descuento = 0.05; // 5% de descuento

        } else {
            descuento = 0.15; // 15% de descuento
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("El precio final con descuento es: " + precioFinal);

        sc.close();
    }
}
