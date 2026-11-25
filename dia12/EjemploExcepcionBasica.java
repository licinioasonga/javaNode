


import java.util.Scanner;

public class EjemploExcepcionBasica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Introduce un número entero: ");
            int numero = sc.nextInt();

            System.out.println("Perfecto, has escrito el número: " + numero);

        } catch (Exception e) {

            System.out.println("Error: debías introducir un número entero "
                    + "válido con cifras.");

        }

        System.out.println("El programa continúa funcionando sin cerrarse.");

        sc.close();

    }
}
