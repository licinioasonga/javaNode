// Clase abstracta: un «instrumento» a secas no sabe cómo suena
abstract class Instrumento {
    // Atributo común
    protected String nombre;

    // Constructor que llamarán las hijas con super
    public Instrumento(String nombre) {
        // Guarda el nombre
        this.nombre = nombre;
        // Cierra el constructor
    }

    // Método abstracto: cada hija decide cómo suena
    public abstract void tocar();
    // Cierra Instrumento
}

// Primera hija concreta
class Guitarra extends Instrumento {
    public Guitarra(String nombre) {
        // Entrega el nombre al padre
        super(nombre);
    }

    // Completa el método pendiente
    @Override
    public void tocar() {
        // Sonido de la guitarra
        System.out.println(this.nombre + " suena: tlan, tlan, tlan");
    }
    // Cierra Guitarra
}

// Segunda hija concreta
class Tambor extends Instrumento {
    public Tambor(String nombre) {
        // Entrega el nombre al padre
        super(nombre);
    }

    // Completa el método pendiente a su manera
    @Override
    public void tocar() {
        // Sonido del tambor
        System.out.println(this.nombre + " suena: pom, pom, pom");
    }
    // Cierra Tambor
}

// Clase principal (archivo EjemploPolimorfismo.java)
public class EjemploPolimorfismo {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Variable del tipo GENERAL: puede apuntar a cualquier hija
        Instrumento instrumento;
        // Ahora apunta a un objeto Guitarra
        instrumento = new Guitarra("Guitarra española");
        // Java mira el objeto real: suena la guitarra
        instrumento.tocar();
        // La MISMA variable apunta ahora a un Tambor
        instrumento = new Tambor("Tambor africano");
        // La MISMA línea de código, otro resultado: suena el tambor
        instrumento.tocar();
        // Cierra el método main
    }
    // Cierra la clase EjemploPolimorfismo
}
