package dia6;


public class Mascota {

    // Atributos privados
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunada;

    // Setter para asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para asignar la especie
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Setter para asignar la edad con validación
    public void setEdad(int edad) {

        if (edad >= 0 && edad <= 40) {
            this.edad = edad;
        } else {
            System.out.println("Aviso: la edad debe estar entre 0 y 40 años.");
        }
    }

    // Setter para indicar si está vacunada
    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    // Método que comprueba si la mascota es cachorro
    public boolean esCachorro() {

        if (edad == 0 || edad == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar la ficha de la mascota
    public void mostrarFicha() {

        System.out.println("===== FICHA DE LA MASCOTA =====");

        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);

        // Mostrar edad en singular o plural
        if (edad == 1) {
            System.out.println("Edad: 1 año");
        } else {
            System.out.println("Edad: " + edad + " años");
        }

        // Comprobar estado de vacunación
        if (vacunada) {
            System.out.println("Vacunas: al día");
        } else {
            System.out.println("Vacunas: PENDIENTES");
        }

        // Comprobar etapa de la mascota
        if (esCachorro()) {
            System.out.println("Etapa: cachorro");
        } else {
            System.out.println("Etapa: adulto");
        }

        System.out.println("-------------------------------");
    }
}

