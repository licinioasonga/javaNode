import java.io.FileWriter;

import java.io.IOException;

public class EjemploEscrituraFichero {
    
    public static void main(String[] args) {
        
        try {
          
            FileWriter escritor = new FileWriter("resumen.txt");
            
            escritor.write("Alumno: Ana\n");
            
            escritor.write("Curso: Programación Java en VS Code\n");
            
            escritor.write("Resultado: Correcto\n");
            
            escritor.close();
           
            System.out.println("Fichero 'resumen.txt' escrito y guardado " +
                    "correctamente.");
        
        } catch (IOException e) {
           
            System.out.println("Error: No se pudo escribir el fichero en el " +
                    "disco.");
       
        }
    
    }

}