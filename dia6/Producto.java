package dia6;

public class Producto {

    // Atributos privados
    private String nombre;
    private double precio;
    private int stock;

    // Setter para asignar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para asignar el precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    // Setter para asignar el stock
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Nombre del artículo: " + nombre);
        System.out.println("Precio unitario: " + precio + " euros");
        System.out.println("Unidades en stock: " + stock);
    }

}
