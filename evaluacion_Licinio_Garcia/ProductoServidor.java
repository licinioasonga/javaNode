package evaluacion_Licinio_Garcia;

public class ProductoServidor {

    private String nombre;
    private double precio;
    private int stock;
    

    public ProductoServidor(String nombre, double precio, int stock) {

        this.nombre = nombre;

            if (precio < 0) {
            this.precio = 0;
             } else {
            this.precio = precio;
            }


            if (stock < 0) {
            this.stock = 0;
             } else {
            this.stock = stock;
            }
    }

    public ProductoServidor(String nombre, double precio) {

    this(nombre, precio, 10);//Iniciamos stock

    }


public void mostrarFicha() {

    System.out.println("Producto: " + nombre + " | Precio: " + precio+ " $ | Stock disponible: " + stock + " uds.");

    }


public void vender(int cantidad) {

        if (cantidad <= 0) {

            System.out.println("Error: La cantidad debe ser mayor que cero.");

        } else if (cantidad > stock) {

            System.out.println("Stock insuficiente para realizar la venta.");

        } else {

        double total = cantidad * precio;

        stock = stock - cantidad;

        System.out.println("Total a cobrar: " + total + " $");
        System.out.println("Unidades restantes: " + stock);

        }
    }

public void reponerStock(int cantidadNueva) {

        if (cantidadNueva > 0) {

             stock = stock + cantidadNueva;

            System.out.println("Reposición realizada correctamente.");
            System.out.println("Nuevo stock: " + stock);

        } else {

        System.out.println("Error: La cantidad debe ser mayor que cero.");

        }
    }


}
