import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class EjemploLecturaFichero {
    
    public static void main(String[] args) {
        
        try {
           
            File archivo = new File("resumen.txt");
           
            Scanner lector = new Scanner(archivo);
            
            System.out.println("--- CONTENIDO LEÍDO DESDE EL FICHERO ---");
           
            while (lector.hasNextLine()) {
                
                String linea = lector.nextLine();
                
                System.out.println(linea);
                
            }
            
            lector.close();
        
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: No se encontró el fichero 'resumen.txt'.");
        
        }
   
    }

}
