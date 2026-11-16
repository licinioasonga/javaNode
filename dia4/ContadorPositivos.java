
package dia4;

import java.util.Scanner;

public class ContadorPositivos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce el número " + i + " de 5: ");

            int numero = teclado.nextInt();

            if (numero > 0) {
                positivos++;
            }
            else if (numero == 0){ceros++;}
            else {negativos++;}
        }

        System.out.println("Has introducido " + positivos + " números positivos.");
        System.out.println("Has introducido " + ceros + " números cero.");
        System.out.println("Has introducido " + negativos + " números negativos.");
        teclado.close();
    }

}
