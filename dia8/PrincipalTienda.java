package dia8;

public class PrincipalTienda {

    public static void main(String[] args) {
        System.out.println("IVA oficial configurado en el sistema: " + (ProductoTienda.IVA * 100) + "%");

        ProductoTienda prod1 = new ProductoTienda("Monitor 24 pulgadas", 100.0);

        ProductoTienda prod2 = new ProductoTienda("Teclado USB", 20.0);

        prod2.setPrecio(25.0);

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println("Total de productos dados de alta hoy: " + ProductoTienda.getTotalProductos());
    }
}