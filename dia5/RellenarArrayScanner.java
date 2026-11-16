package dia5;

import java.util.Scanner;


public class RellenarArrayScanner {
    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print("Introduce el número " + (i + 1) + ": ");
           
            numeros[i] = teclado.nextInt();
            
        }
        
        System.out.println("\nHas guardado correctamente los 5 números.");
        
        System.out.print("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
          
            System.out.print(" " + numeros[i]);
        }
        // Salto de línea final
        System.out.println();
     
        teclado.close();
      
    }
   
}
