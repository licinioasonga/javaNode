
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

    // Mostramos información de la petición en terminal
    console.log("================================");
    console.log("Visita número: " + visitasTotales);
    console.log("Método: " + req.method);
    console.log("Ruta solicitada: " + req.url);
    console.log("================================");



    if (req.url === "/") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        res.end(`
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <title>Informática Sur</title>
            </head>
            <body>
                <h1>Bienvenidos al Servidor de Informática Sur</h1>

                <h2>Panel principal</h2>

                <p>Visitas totales al servidor: ${visitasTotales}</p>

                <h3>Enlaces disponibles:</h3>

                <ul>
                    <li><a href="/catalogo">Catálogo de productos</a></li>
                    <li><a href="/ofertas">Ofertas económicas</a></li>
                    <li><a href="/contacto">Contacto</a></li>
                    <li><a href="/api/productos">API de productos (JSON)</a></li>
                    <li><a href="/api/estado">Estado del servidor (JSON)</a></li>
                </ul>

            </body>
            </html>
        `);


    // 3.2 RUTA DEL CATÁLOGO COMPLETO
    } else if (req.url === "/catalogo") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        let contenido = `
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <title>Catálogo de productos</title>
            </head>
            
            <body>
                <h1>Catálogo completo de productos</h1>
        `;

        
        for (let i = 0; i < productos.length; i++) {

            contenido += `
                <h2>${productos[i].nombre}</h2>
                <p>Stock: ${productos[i].stock} unidades</p>
                <p>Precio base: ${productos[i].precio} €</p>
                <p>Precio con IVA: ${productos[i].calcularPrecioConIva().toFixed(2)} €</p>
                <hr>
            `;
        }

        contenido += `
                <a href="/">Volver al inicio</a>

            </body>
            </html>
        `;

        res.end(contenido);


   
    } else if (req.url === "/ofertas") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        let contenido = `
            <!DOCTYPE html>
            <html lang="es">
            
            <head>
                <meta charset="UTF-8">
                <title>Ofertas económicas</title>
            </head>
            
            <body>
                <h1>Ofertas económicas</h1>
                <p>Productos con precio inferior a 100 €:</p>
        `;

       
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

        contenido += `
                <a href="/">Volver al inicio</a>

            </body>
            </html>
        `;

        res.end(contenido);


    

    } else if (req.url === "/contacto") {

        res.writeHead(200, {
            'Content-Type': 'text/html; charset=utf-8'
        });

        res.end(`
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <title>Contacto</title>
            </head>
            
            <body>
                <h1>Atención al Cliente y Soporte Técnico</h1>
                <p><strong>Correo electrónico:</strong> info@informaticasur.es</p>
                <p><strong>Teléfono:</strong> 954 123 456</p>
                <p><strong>Horario:</strong> Lunes a viernes, de 9:00 a 18:00</p>
                <a href="/">Volver al inicio</a>
            </body>
            </html>
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
            <!DOCTYPE html>
            <html lang="es">
            <head>
                <meta charset="UTF-8">
                <title>Error 404</title>
            </head>
            <body>

                <h1>Error 404: Página no encontrada en el servidor</h1>

                <p>La ruta solicitada no existe: ${req.url}</p>

                <a href="/">Volver al inicio</a>

            </body>
            </html>
        `);
    }

});


           servidor.listen(3000, () => {
                    console.log("================================");
                    console.log("Servidor de Informática Sur iniciado");
                    console.log("Escuchando en http://localhost:3000");
                    console.log("================================");
});
