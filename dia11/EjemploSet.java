package dia11;

import java.util.HashSet;


public class EjemploSet {
  
    public static void main(String[] args) {
        
        HashSet<String> categorias = new HashSet<String>();
       
        categorias.add("Bebidas");
       
        categorias.add("Limpieza");
       
        categorias.add("Bebidas");
        
        System.out.println("Cantidad real guardada sin duplicados: "
                + categorias.size());
        
        System.out.println("Contenido del conjunto: " + categorias);
        
    }
   
}
