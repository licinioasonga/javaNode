package dia4;


// EjemploDoWhile.java)

public class EjemploDoWhile {

    public static void main(String[] args) {
       
        int numero = 1;
      
        do {
            System.out.println("Ejecutando vuelta con valor: " + numero);
          
            numero++;
            
        } while (numero <= 5);
       
        System.out.println("Hemos salido del do-while.");
        
    }
    
}
