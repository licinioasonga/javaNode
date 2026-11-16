package dia5;

public class MostrarMatriz {
   
    public static void main(String[] args) {
        
        int[][] matriz = {
                
                { 1, 2, 3 },
                
                { 4, 5, 6 },
                
                { 7, 8, 9 }
                
        };
       
        for (int fila = 0; fila < matriz.length; fila++) {
          
            for (int columna = 0; columna < matriz[fila].length; columna++) {
               
                System.out.print(matriz[fila][columna] + "\t");
            
            }
            
            System.out.println();
           
        }
        
    }
    
}
