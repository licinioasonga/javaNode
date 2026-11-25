
import java.util.Scanner;

public class Ejercicio1LectorSeguro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un numero entero: ");
            int numero = sc.nextInt();

            System.out.println("Has introducido el numero: " + numero);

        } catch (Exception e) {
            System.out.println("Aviso: debes introducir un numero entero valido.");
        }

        sc.close();
    }
}
