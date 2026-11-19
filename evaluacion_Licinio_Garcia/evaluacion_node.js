

class ProductoNode {

    constructor(nombre, precio, stock) {

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    
     mostrarFicha() {

                console.log("Producto: " + this.nombre + " | Precio: " + this.precio + " $ | Stock: " + this.stock + " uds.");

        }

    
    aplicarDescuento(porcentaje) {

                this.precio = this.precio - (this.precio * porcentaje / 100);

        }

}

    const producto1 = new ProductoNode("Servidor HP", 1000, 5);
    const producto2 = new ProductoNode("Router TP-Link", 80, 10);


    console.log("=== PRODUCTOS INICIALES ===");

        producto1.mostrarFicha();
        producto2.mostrarFicha();


    console.log("\n=== APLICANDO DESCUENTO ===");

        producto1.aplicarDescuento(10);


    console.log("\n=== PRODUCTO CON DESCUENTO ===");

        producto1.mostrarFicha();
