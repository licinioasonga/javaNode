package dia6;


public class PrincipalCoche {

    public static void main(String[] args) {

        // Crear el primer coche
        Coche coche1 = new Coche();

        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla");

        // Crear el segundo coche
        Coche coche2 = new Coche();

        coche2.setMarca("BMW");
        coche2.setModelo("Serie 3");

        // El primer coche recorre kilómetros
        System.out.println("RECORRIDOS DEL COCHE 1");

        coche1.recorrerKilometros(100);
        coche1.recorrerKilometros(250);
        coche1.recorrerKilometros(50);
        coche1.recorrerKilometros(51110);

        // El segundo coche recorre kilómetros
        System.out.println("\nRECORRIDOS DEL COCHE 2");

        coche2.recorrerKilometros(300);
        coche2.recorrerKilometros(150);
        coche2.recorrerKilometros(200);
        coche2.recorrerKilometros(10000);

        // Mostrar el estado final de los coches
        System.out.println("\n=== ESTADO FINAL ===");

        System.out.println("\nCOCHE 1:");
        coche1.mostrarDatos();

        System.out.println("COCHE 2:");
        coche2.mostrarDatos();

    }
}
