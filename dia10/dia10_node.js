// Primera clase sin necesidad de 'implements'
class EmpleadoFijo {
  constructor(nombre, sueldoMensual) {
    // Guarda el nombre
    this.nombre = nombre;
    // Guarda el sueldo fijo
    this.sueldoMensual = sueldoMensual;
  }
  // Método con el mismo nombre
  calcularPago() {
    return this.sueldoMensual;
  }
  getDescripcion() {
    return "Empleado fijo: " + this.nombre;
  }
}
// Segunda clase totalmente distinta
class RepartidorPorHoras {
  constructor(nombre, horas, precioHora) {
    // Guarda el nombre
    this.nombre = nombre;
    // Guarda las horas
    this.horas = horas;
    // Guarda el precio por hora
    this.precioHora = precioHora;
  }
  // Mismo nombre de método, distinta fórmula
  calcularPago() {
    return this.horas * this.precioHora;
  }
  getDescripcion() {
    return "Repartidor por horas: " + this.nombre;
  }
}
// Guardamos objetos de clases distintas en una misma lista dinámica de Node.js:
const trabajadores = [
  new EmpleadoFijo("Ana", 1400.0),
  new RepartidorPorHoras("Luis", 80, 12.5),
  new RepartidorPorHoras("Marta", 60, 11.0),
];
// Polimorfismo en acción: recorremos todos y llamamos al mismo método
// calcularPago():
for (let i = 0; i < trabajadores.length; i++) {
  // Cada objeto ejecuta su propia fórmula
  const pago = trabajadores[i].calcularPago();
  console.log(
    trabajadores[i].getDescripcion() + " | Pago en Node.js: " + pago + " €",
  );
}
