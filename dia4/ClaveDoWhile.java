package dia4;

import java.util.Scanner;


public class ClaveDoWhile {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        String clave;
       
        do {
            
            System.out.print("Introduce la contraseña de acceso al servidor: ");
           
            clave = sc.nextLine();
            
            if (!clave.equals("java123")) {
                
                System.out.println("[X] Clave incorrecta. Inténtalo de nuevo.\n");
                
            }
           
        } while (!clave.equals("java123"));
        
        System.out.println("[OK] ¡Contraseña correcta! Acceso concedido al " +
                "panel principal.");
     
        sc.close();
        
    }
    
}
