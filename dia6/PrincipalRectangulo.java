package dia6;


import java.util.Scanner;

public class PrincipalRectangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear objeto Rectangulo
        Rectangulo rectangulo1 = new Rectangulo();

        // Pedir la base
        System.out.print("Introduce la base del rectángulo: ");
        double base = teclado.nextDouble();

        // Pedir la altura
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        // Asignar los valores mediante los setters
        rectangulo1.setBase(base);
        rectangulo1.setAltura(altura);

        // Comprobar que los valores son válidos
        if (base > 0 && altura > 0) {

            // Mostrar resultados
            System.out.println("\n===== RESULTADOS =====");

            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);

            System.out.println("Área: " + rectangulo1.getArea());

            System.out.println("Perímetro: " + rectangulo1.getPerimetro());

            // Redondear diagonal a 2 decimales
            double diagonal = rectangulo1.getDiagonal();

            double diagonalRedondeada = Math.round(diagonal * 100.0) / 100.0;

            System.out.println("Diagonal: " + diagonalRedondeada);

            // Comprobar si es un cuadrado
            if (rectangulo1.esCuadrado()) {
                System.out.println("¿Es un cuadrado? Sí");
            } else {
                System.out.println("¿Es un cuadrado? No");
            }

        } else {
            System.out.println("No se pueden realizar los cálculos. Introduce valores positivos.");
        }

        teclado.close();
    }
}
