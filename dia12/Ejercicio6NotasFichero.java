
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6NotasFichero {

    public static void main(String[] args) {

        // Creamos una lista para guardar las notas
        ArrayList<Double> notas = new ArrayList<>();

        // Añadimos las 4 notas
        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);

        // Calculamos la suma de las notas
        double suma = 0;

        for (int i = 0; i < notas.size(); i++) {
            suma = suma + notas.get(i);
        }

        // Calculamos la media
        double media = suma / notas.size();

        // Guardamos las notas y la media en un fichero
        try {
            FileWriter escritor = new FileWriter("acta_notas.txt");

            escritor.write("ACTA DE NOTAS\n");
            escritor.write("------------------\n");

            for (int i = 0; i < notas.size(); i++) {
                escritor.write("Nota " + (i + 1) + ": " + notas.get(i) + "\n");
            }

            escritor.write("------------------\n");
            escritor.write("Media del curso: " + media + "\n");

            escritor.close();

            System.out.println("Acta de notas guardada correctamente.");
            System.out.println("La media es: " + media);

        } catch (IOException e) {
            System.out.println("Error al guardar el fichero.");
        }
    }
}
