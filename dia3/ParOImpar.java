package dia3;

import java.util.Scanner;

public class ParOImpar {
    
    public static void main(String[] args) {

  // Crear el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Pedir un número al usuario
        System.out.println("Introduce un número:");
        
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

       
        sc.close();
    }
}
