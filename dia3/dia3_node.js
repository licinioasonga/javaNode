// En Node.js declaramos la variable sin indicar el tipo numérico; usamos 'const'
// porque su valor no va a cambiar (como vimos el Día 1)
const consumo = 85;
// Preparamos la variable donde guardaremos la tarifa resultante
let precio = 0;
// La sintaxis del if con paréntesis y llaves es 100% idéntica a la de Java
if (consumo <= 50) {
  // Asigna la tarifa básica si consume 50 o menos
  precio = 10;
  // El encadenamiento con 'else if' funciona exactamente igual que en Java
} else if (consumo <= 100) {
  // Asigna la tarifa intermedia porque 85 es menor o igual a 100
  precio = 18;
  // El bloque final por descarte también se escribe igual
} else {
  // Asigna la tarifa superior
  precio = 25;
  // Cierra el bloque condicional
}
// Imprime el resultado por la terminal con console.log
console.log(
  "Para un consumo de " +
    consumo +
    ", el precio en Node.js es: " +
    precio +
    " euros.",
);
