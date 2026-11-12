package dia3;

import java.util.Scanner;

/*
Pide por teclado la edad de una persona y su porcentaje de
asistencia, y muestra con if-else y el operador &&
si puede recibir el diploma del curso.
*/

public class ValidadorActividad {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad de la persona: ");
        int edad = sc.nextInt();

        System.out.print("Introduce el porcentaje de asistencia (0-100): ");
        double asistencia = sc.nextDouble();

        if (edad >= 18 && asistencia >= 75) {
            System.out.println("La persona puede recibir el diploma del curso.");
        } else {
            System.out.println("La persona no puede recibir el diploma del curso.");
        }

        sc.close();
    }
}

