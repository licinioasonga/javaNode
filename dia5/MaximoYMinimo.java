package dia5;

public class MaximoYMinimo {
   
    public static void main(String[] args) {
     
        int[] numeros = { 12, 7, 30, 4, 18 };
        
        int maximo = numeros[0];
        
        int minimo = numeros[0];
       
        for (int i = 1; i < numeros.length; i++) {
          
            if (numeros[i] > maximo) {
            
                maximo = numeros[i];
                
            }
        
            if (numeros[i] < minimo) {
               
                minimo = numeros[i];
               
            }
            
        }
       
        System.out.println("El valor máximo del array es: " + maximo);
     
        System.out.println("El valor mínimo del array es: " + minimo);
       
    }

}