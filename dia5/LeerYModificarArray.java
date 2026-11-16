package dia5;

public class LeerYModificarArray {

    public static void main(String[] args) {
       
        int[] edades = { 18, 20, 19, 21, 22 };
        
        System.out.println("Primera casilla (índice 0): " + edades[0]);
        
        System.out.println("Tercera casilla (índice 2): " + edades[2]);
        
      
        edades[2] = 25;
        
        System.out.println("Tercera casilla tras el cambio: " + edades[2]);
       
    }
   
}