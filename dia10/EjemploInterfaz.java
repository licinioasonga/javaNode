
interface Encendible {
    // Obliga a programar la acción de encender
    void encender();

    // Obliga a programar la acción de apagar
    void apagar();
    // Cierra la interfaz Encendible
}

// 'implements Encendible' significa que Lampara firma el contrato y se
// compromete
// a programar sus métodos
class Lampara implements Encendible {
    // Atributo privado propio de la lámpara para recordar si está dando luz
    // (true) o apagada (false)
    private boolean encendida;

    // Constructor de la lámpara
    public Lampara() {
        // Al fabricar la lámpara con 'new', empieza apagada por seguridad
        this.encendida = false;
        // Cierra el constructor
    }

    // Indica que estamos cumpliendo la primera promesa del contrato Encendible
    @Override
    // Programamos cómo se enciende concretamente una lámpara
    public void encender() {
        // Comprobamos si NO estaba encendida
        if (!this.encendida) {
            // Cambiamos su estado interno a encendida (true)
            this.encendida = true;
            // Mostramos el mensaje propio de la lámpara
            System.out.println("La lámpara se ha encendido e ilumina la " +
                    "habitación.");
            // Si ya estaba en true:
        } else {
            // Avisamos de que no hace falta encenderla otra vez
            System.out.println("La lámpara ya estaba encendida.");
            // Cierra el condicional if-else
        }
        // Cierra el método encender
    }

    // Indica que estamos cumpliendo la segunda promesa del contrato Encendible
    @Override
    // Programamos cómo se apaga concretamente una lámpara
    public void apagar() {
        // Solo la apagamos si realmente estaba encendida (true)
        if (this.encendida) {
            // Cambiamos su estado interno a apagada (false)
            this.encendida = false;
            // Mostramos el mensaje de apagado
            System.out.println("La lámpara se ha apagado.");
            // Si ya estaba en false:
        } else {
            // Avisamos al usuario
            System.out.println("La lámpara ya estaba apagada.");
            // Cierra el condicional if-else
        }
        // Cierra el método apagar
    }
    // Cierra la clase Lampara
}

// Ventilador también firma el mismo contrato 'Encendible' con la palabra
// 'implements'
class Ventilador implements Encendible {
    // Atributo privado propio del ventilador para saber si sus aspas están
    // girando
    private boolean encendido;

    // Constructor del ventilador
    public Ventilador() {
        // Al crear el ventilador, también empieza detenido (false)
        this.encendido = false;
        // Cierra el constructor
    }

    // Cumple el método encender() del contrato, pero adaptado al comportamiento
    // de un ventilador
    @Override
    // Acción de encender el ventilador
    public void encender() {
        // Si estaba apagado:
        if (!this.encendido) {
            // Pasa a estar en marcha
            this.encendido = true;
            // Mensaje específico del ventilador
            System.out.println("El ventilador empieza a girar las aspas.");
            // Si ya estaba girando:
        } else {
            // Aviso específico
            System.out.println("El ventilador ya estaba funcionando.");
            // Cierra el if-else
        }
        // Cierra encender
    }

    // Cumple el método apagar() del contrato
    @Override
    // Acción de apagar el ventilador
    public void apagar() {
        // Si estaba girando:
        if (this.encendido) {
            // Lo detenemos
            this.encendido = false;
            // Mensaje al parar
            System.out.println("El ventilador se detiene.");
            // Si ya estaba parado:
        } else {
            // Aviso al usuario
            System.out.println("El ventilador ya estaba apagado.");
            // Cierra el if-else
        }
        // Cierra apagar
    }
    // Cierra la clase Ventilador
}

// Clase principal con el método main para probar ambos aparatos (archivo
// EjemploInterfaz.java)
public class EjemploInterfaz {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Creamos un objeto Lampara normal en memoria
        Lampara lampara = new Lampara();
        // Creamos un objeto Ventilador normal en memoria
        Ventilador ventilador = new Ventilador();
        // Llamamos a encender() en la lámpara
        lampara.encender();
        // Llamamos a apagar() en la lámpara
        lampara.apagar();
        // Llamamos a encender() en el ventilador
        ventilador.encender();
        // Llamamos a apagar() en el ventilador
        ventilador.apagar();
        // Cierra el método main
    }
    // Cierra la clase EjemploInterfaz
}