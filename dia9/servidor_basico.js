const http = require('http');

class Empleado {
 constructor(nombre) { this.nombre = nombre; }
}
class Comercial extends Empleado {
 constructor(nombre, comision) {
 super(nombre);
 this.comision = comision;
 }
}

const servidor = http.createServer((req, res) => {
 const comercialDelMes = new Comercial("Carlos Ruiz", 350.50);
 // writeHead → write → end (siguiente diapositiva)
})

res.writeHead(200, {
 'Content-Type': 'text/html; charset=utf-8' });

 res.write("<p><b>Comercial del mes (POO):</b> "
 + comercialDelMes.nombre + " (Comisión: "
 + comercialDelMes.comision + " €)</p>");

servidor.listen(3000, () => {
 console.log("Servidor HTTP arrancado. Abre tu navegador en: http://localhost:3000");
 console.log("(Para apagar el servidor en la terminal, pulsa Ctrl + C)");
});

