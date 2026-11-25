const EstadoReserva = Object.freeze({
  PENDIENTE: "PENDIENTE",
  CONFIRMADA: "CONFIRMADA",
  CANCELADA: "CANCELADA",
});

const listaAlumnos = [];

listaAlumnos.push("Ana");

listaAlumnos.push("Luis");

const categorias = new Set();

categorias.add("Bebidas");

categorias.add("Bebidas");

const precios = new Map();

precios.set("Pan", 1.2);

console.log("Estado en Node.js: " + EstadoReserva.CONFIRMADA);

console.log("Tamaño del Set sin duplicados: " + categorias.size);

console.log("Precio del Pan en el Map: " + precios.get("Pan") + " €");

console.log("Alumnos en la lista: " + listaAlumnos.length);
