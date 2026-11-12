package dia3;

import java.util.Scanner;

public class CalculadoraSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Selecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                break;

            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                break;

            case 3:
                System.out.println("La multiplicación es: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("La división es: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
