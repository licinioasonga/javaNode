
package dia7;

public class ReferenciaCompartida {

    public static void main(String[] args) {

        // 1. Creamos un objeto Rectangulo
        Rectangulo r1 = new Rectangulo(10, 5);

        // 2. r2 apunta al mismo objeto que r1
        Rectangulo r2 = r1;

        // 3. Mostramos los datos iniciales
        System.out.println("DATOS INICIALES:");

        r1.mostrarDatos();

        // 4. Modificamos la base utilizando r2
        r2.setBase(20);

        // 5. Mostramos los datos utilizando r1
        System.out.println("DATOS DESPUES DE MODIFICAR:");

        r1.mostrarDatos();

    }
}
