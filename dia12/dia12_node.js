
const fs = require('fs');

const nombres = ["Luis", "Ana", "Marta", "Carlos"];

nombres.sort();

console.log("Lista ordenada en Node.js:", nombres);

try {
    
    fs.writeFileSync("resumen_node.txt",
            "Informe generado desde Node.js\nTodo correcto.");
   
    console.log("Fichero 'resumen_node.txt' guardado correctamente.");
   
    const contenido = fs.readFileSync("resumen_node.txt", "utf-8");

    console.log("Contenido leído:\n" + contenido);

} catch (error) {
    
    console.log("Error al manejar el fichero en Node.js");

}