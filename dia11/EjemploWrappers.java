package dia11;

import java.util.ArrayList;


public class EjemploWrappers {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> notas = new ArrayList<Integer>();
      
        notas.add(7);
        
        notas.add(8);
        
        notas.add(9);
       
        int suma = 0;
        


             for (int i = 0; i < notas.size(); i++) {

            suma = suma + notas.get(i);

             }

        System.out.println("Suma total de las notas: " + suma);

    }

}
