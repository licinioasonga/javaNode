// Paso 1: Cargamos el módulo readline
const readline = require("readline");
// Paso 2: Creamos el lector de teclado
const teclado = readline.createInterface({ input: process.stdin,
 output: process.stdout });
// Paso 3: Lo que escribe el usuario llega como texto a 'texto'
teclado.question("Introduce el precio base del producto: ", (texto) => {
 // Convertimos el texto en número para poder calcular (si no es un número
 // válido, será NaN)
 const precioBase = Number(texto);
 // Calculamos el 21% de IVA
 const iva = precioBase * 0.21;
 // Con 100 muestra: IVA (21%): 21 euros
 console.log("IVA (21%): " + iva + " euros");
 // Los paréntesis hacen que primero se sume y luego se concatene. Con 100
 // muestra: Total: 121 euros
 console.log("Total: " + (precioBase + iva) + " euros");
 // Cerramos el lector de teclado
 teclado.close();
// Cierra el bloque de la respuesta
});