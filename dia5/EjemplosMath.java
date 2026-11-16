package dia5;

public class EjemplosMath {
    
    public static void main(String[] args) {
        
        System.out.println("Raíz cuadrada de 25: " + Math.sqrt(25));
        
        System.out.println("2 elevado al cubo (2^3): " + Math.pow(2, 3));
        
        System.out.println("Redondeo de 4.6: " + Math.round(4.6));
       
        System.out.println("El mayor entre 7 y 12 es: " + Math.max(7, 12));
        
        System.out.println("El menor entre 7 y 12 es: " + Math.min(7, 12));
        
        int dado = (int) (Math.random() * 6) + 1;
        
        System.out.println("Tirada de dado aleatoria (del 1 al 6): " + dado);
        
    }
   
}