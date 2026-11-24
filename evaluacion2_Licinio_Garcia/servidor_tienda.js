

class ProductoTienda {

    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    calcularPrecioConIva() {
        return this.precio * 1.21;
    }
}

const productos = [
    new ProductoTienda("Portátil", 750, 5),
    new ProductoTienda("Monitor", 180, 8),
    new ProductoTienda("Teclado", 45, 15),
    new ProductoTienda("Ratón", 25, 20)
];

let visitasTotales = 0;

const http = require('http');

const servidor = http.createServer((req, res) => {

    visitasTotales++;

    console.log("Visita número: " + visitasTotales);
    console.log("Método: " + req.method);
    console.log("Ruta: " + req.url);


    // 5. PÁGINA PRINCIPAL
    if (req.url === "/") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        res.end(`
            <h1>Bienvenidos a Informática Sur</h1>

            <h2>Panel principal</h2>

            <p>Visitas totales: ${visitasTotales}</p>

            <ul>
                <li><a href="/catalogo">Ver catálogo</a></li>
                <li><a href="/ofertas">Ver ofertas</a></li>
                <li><a href="/contacto">Contacto</a></li>
                <li><a href="/api/productos">API de productos</a></li>
                <li><a href="/api/estado">Estado del servidor</a></li>
            </ul>
        `);


    // 6. CATÁLOGO DE PRODUCTOS
    } else if (req.url === "/catalogo") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        let contenido = "<h1>Catálogo de productos</h1>";

        // Recorremos todos los productos
        for (let i = 0; i < productos.length; i++) {

            contenido += `
                <h2>${productos[i].nombre}</h2>
                <p>Stock: ${productos[i].stock}</p>
                <p>Precio: ${productos[i].precio} €</p>
                <p>Precio con IVA: ${productos[i].calcularPrecioConIva().toFixed(2)} €</p>
                <hr>
            `;
        }

        contenido += '<a href="/">Volver al inicio</a>';

        res.end(contenido);

    } else if (req.url === "/ofertas") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        let contenido = "<h1>Ofertas económicas</h1>";

        for (let i = 0; i < productos.length; i++) {

            if (productos[i].precio < 100) {

                contenido += `
                    <h2>${productos[i].nombre}</h2>
                    <p>Precio: ${productos[i].precio} €</p>
                    <p>Precio con IVA: ${productos[i].calcularPrecioConIva().toFixed(2)} €</p>
                    <hr>
                `;
            }
        }

        contenido += '<a href="/">Volver al inicio</a>';

        res.end(contenido);


    } else if (req.url === "/contacto") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        res.end(`
            <h1>Atención al Cliente</h1>
            <p>Correo: info@informaticasur.es</p>
            <p>Teléfono: 954 123 456</p>
            <p>Horario: Lunes a viernes, de 9:00 a 18:00</p>
            <a href="/">Volver al inicio</a>
        `);


    } else if (req.url === "/api/productos") {

        res.writeHead(200, {
            'Content-Type': 'application/json; charset=utf-8'
        });

        res.end(JSON.stringify(productos));


    } else if (req.url === "/api/estado") {

        res.writeHead(200, {
            'Content-Type': 'application/json; charset=utf-8'
        });

        const estadoServidor = {
            tienda: "Informática Sur",
            estado: "Operativo",
            puerto: 3000,
            visitas: visitasTotales
        };

        res.end(JSON.stringify(estadoServidor));


    } else {

        res.writeHead(404, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        res.end(`
            <h1>Error 404</h1>
            <p>La página no existe: ${req.url}</p>
            <a href="/">Volver al inicio</a>
        `);
    }

});


servidor.listen(3000, () => {

    console.log("Servidor iniciado correctamente");
    console.log("Entra en http://localhost:3000");

});
