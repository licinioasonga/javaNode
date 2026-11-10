package dia2;

public class ComparadorNumeros {public static void main(String[] args) {
    //Introducimos dos números por teclado
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    double numero1, numero2;
    System.out.println("Introduce el primer número:");
    numero1 = teclado.nextDouble();
    System.out.println("Introduce el segundo número:");
    numero2 = teclado.nextDouble();
    if (numero1 > numero2) {
        System.out.println("El primer número es mayor que el segundo.");
    } else if (numero1 < numero2) {
        System.out.println("El segundo número es mayor que el primero.");
    } else {
        System.out.println("Los dos números son iguales.");
    }
    teclado.close();
}
    
}
