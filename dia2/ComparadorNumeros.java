package dia2;

public class ComparadorNumeros {public static void main(String[] args) {
    //Introducimos dos números por teclado
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    double numero1, numero2;
    System.out.println("Introduce el primer número:");
    numero1 = teclado.nextDouble();
    System.out.println("Introduce el segundo número:");
    numero2 = teclado.nextDouble();
   boolean numeromayor = (numero1 > numero2 );
   boolean numeromenor = (numero1 < numero2 );
   boolean numeroigual = (numero1 == numero2 );

   System.out.println("El primer número es mayor que el segundo: " + numeromayor);
   System.out.println("El primer número es menor que el segundo: " + numeromenor);
   System.out.println("El primer número es igual que el segundo: " + numeroigual);
    teclado.close();
}
    
}
