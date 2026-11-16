package dia4;

import java.util.Scanner;


public class TablaMultiplicar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero para ver su tabla de " +
                "multiplicar: ");
       
        int numero = sc.nextInt();
        
        System.out.println("\n--- TABLA DEL " + numero + " ---");
       
        for (int i = 1; i <= 10; i++) {
            
            int resultado = numero * i;
            
            System.out.println(numero + " x " + i + " = " + resultado);
            
        }
        
        sc.close();
       
    }
   
}