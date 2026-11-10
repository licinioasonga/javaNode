package dia2;
// Importamos la herramienta Scanner para leer el importe base desde el teclado
import java.util.Scanner;
// Definimos la clase PrecioFinal (archivo PrecioFinal.java)
public class PrecioFinal {
 // Arrancamos el método principal main
 public static void main(String[] args) {
 // Inicializamos el lector de teclado 'sc'
 Scanner sc = new Scanner(System.in);
 // Pedimos al usuario que escriba el precio inicial
 System.out.print("Introduce el precio base del producto: ");
 // Leemos el valor decimal (recuerda usar coma en la consola si tu Windows
 // está en español)
 double precioBase = sc.nextDouble();
 // Paso 1: Calculamos cuánto dinero supone el 10% de descuento
 // multiplicando por 0.10
 double descuento = precioBase * 0.10;
 // Paso 2: Restamos ese descuento al precio original para obtener el
 // precio rebajado
 double precioConDescuento = precioBase - descuento;
 // Paso 3: Calculamos el 21% de IVA sobre el precio ya rebajado
double iva = precioConDescuento * 0.21;
 // Paso 4: Sumamos el IVA al precio rebajado para obtener el total final
 // de la factura
 double precioFinal = precioConDescuento + iva;
 // Mostramos un encabezado precedido de un salto de línea (\n)
 System.out.println("\n--- DESGLOSE DEL TICKET ---");
 // Imprimimos el precio original alineado con tabuladores (\t)
 System.out.println("Precio base:\t\t" + precioBase + " euros");
 // Mostramos cuántos euros se han descontado
 System.out.println("Descuento (10%):\t-" + descuento + " euros");
 // Mostramos cuántos euros se suman de impuestos
 System.out.println("IVA aplicable (21%):\t+" + iva + " euros");
 // Imprimimos el importe definitivo (para 100 mostraría 108.9)
 System.out.println("Precio final a pagar:\t" + precioFinal + " euros");
 // Cerramos el lector de teclado
 sc.close();
 // Cerramos el método main
 }
// Cerramos la clase PrecioFinal
}
