

abstract class Animal {

    // Atributos comunes que heredarán todos los animales
    protected String nombre;
    protected int edad;

    // Constructor de la clase abstracta
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método normal heredado por las clases hijas
    public void mostrarDatos() {
        System.out.println("Animal: " + this.nombre
                + " | Edad: " + this.edad + " años");
    }

    // Método abstracto: cada animal debe definir su sonido
    public abstract void hacerSonido();
}

// Subclase Perro
class Perro extends Animal {

    // Constructor del perro
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Guau, guau!");
    }
}

// Subclase Gato
class Gato extends Animal {

    // Constructor del gato
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(this.nombre + " dice: ¡Miau!");
    }
}

// Clase principal
public class EjemploAbstracta {

    public static void main(String[] args) {

        // Crear un perro y un gato
        Perro perro = new Perro("Toby", 3);
        Gato gato = new Gato("Misu", 2);

        // Mostrar datos y sonidos del perro
        perro.mostrarDatos();
        perro.hacerSonido();

        // Mostrar datos y sonidos del gato
        gato.mostrarDatos();
        gato.hacerSonido();
    }
}
