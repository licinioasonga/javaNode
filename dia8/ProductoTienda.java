
package dia8;

public class ProductoTienda {

    // Atributos privados
    private String nombre;
    private double precio;

    // Atributo estático: compartido por todos los productos
    private static int totalProductos = 0;

    // Constante: IVA del 21%
    public static final double IVA = 0.21;

    // Constructor
    public ProductoTienda(String nombre, double precio) {

        this.nombre = nombre;

        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
            System.out.println("El precio no puede ser negativo.");
        }

        totalProductos++;
    }

    // Getter del nombre
    public String getNombre() {
        return this.nombre;
    }

    // Getter del precio
    public double getPrecio() {
        return this.precio;
    }

    // Setter del precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    // Método estático para consultar el total de productos
    public static int getTotalProductos() {
        return totalProductos;
    }

    // Calcula el precio con IVA
    public double calcularPrecioConIva() {
        return this.precio + (this.precio * IVA);
    }

    // Representación del objeto como texto
    @Override
    public String toString() {
        return "ProductoTienda{nombre='" + this.nombre
                + "', precioBase=" + this.precio
                + "€, precioConIVA=" + this.calcularPrecioConIva() + "€}";
    }
}
