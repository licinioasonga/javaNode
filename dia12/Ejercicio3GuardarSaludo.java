
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3GuardarSaludo {

    public static void main(String[] args) {

        try {
            FileWriter escritor = new FileWriter("saludo.txt");

            escritor.write("Hola, bienvenido a Java.\n");
            escritor.write("Estoy aprendiendo a guardar archivos.\n");
            escritor.write("Este es mi tercer ejercicio.\n");

            escritor.close();

            System.out.println("Archivo guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }
}
