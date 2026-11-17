package dia6;

public class PrincipalMascota {

    public static void main(String[] args) {

        // Crear la primera mascota
        Mascota mascota1 = new Mascota();

        // Mostrar ficha sin asignar ningún valor
        System.out.println("FICHA INICIAL");
        mascota1.mostrarFicha();

        // Asignar los datos de Luna
        mascota1.setNombre("Coco");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(4);
        mascota1.setVacunada(true);

        // Mostrar ficha de Luna
        System.out.println("\nFICHA DE LUNA");
        mascota1.mostrarFicha();


        // Crear la segunda mascota
        Mascota mascota2 = new Mascota();

        mascota2.setNombre("Michi");
        mascota2.setEspecie("Gato");

        // Intentar asignar una edad incorrecta
        mascota2.setEdad(-2);

        // Asignar una edad válida
        mascota2.setEdad(1);

        // Mostrar ficha de Michi
        System.out.println("\nFICHA DE MICHI");
        mascota2.mostrarFicha();

    }
}
