package dia3;

public class ClasificacionNota {

      
    public static void main(String[] args) {

        double nota = 5.5;

        if (nota < 5) {
            System.out.println("Insuficiente");

        } else if (nota < 7) {
            System.out.println("Suficiente");

        } else if (nota < 9) {
            System.out.println("Notable");

        } else if (nota <= 10) {
            System.out.println("Sobresaliente");

        } else {
            System.out.println("Nota no válida");
        }

    }
}