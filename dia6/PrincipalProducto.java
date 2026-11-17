package dia6;

public class PrincipalProducto {
    // Punto de entrada donde arranca la ejecución
    public static void main(String[] args) {

        Producto p1 = new Producto();

        Producto p2 = new Producto();

        p1.setNombre("Teclado Mecánico");

        p1.setPrecio(29.99);

        p1.setStock(10);

        p2.setNombre("Ratón Inalámbrico");

        p2.setPrecio(18.50);

        p2.setStock(25);

        System.out.println("-----------------");

        p1.mostrarInformacion();

        System.out.println("--------------------");

        p2.mostrarInformacion();
    }

}
