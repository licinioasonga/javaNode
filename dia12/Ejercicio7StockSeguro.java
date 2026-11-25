
import java.util.Scanner;

public class Ejercicio7StockSeguro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce las unidades que quieres añadir al stock: ");

            int cantidad = sc.nextInt();

            if (cantidad < 0) {
                System.out.println("Error: No puedes introducir una cantidad negativa.");
            } else {
                System.out.println("Stock actualizado correctamente.");
                System.out.println("Unidades añadidas: " + cantidad);
            }

        } catch (Exception e) {
            System.out.println("Error: Debes introducir un numero entero valido.");
        }

        sc.close();
    }
}
