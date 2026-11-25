
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio4LeerSaludo {

    public static void main(String[] args) {

        try {
            FileReader lector = new FileReader("saludo.txt");

            BufferedReader lectorLinea = new BufferedReader(lector);

            String linea;

            while ((linea = lectorLinea.readLine()) != null) {
                System.out.println(linea);
            }

            lectorLinea.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
