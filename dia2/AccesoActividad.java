package dia2;
// Definimos la clase AccesoActividad (archivo AccesoActividad.java)
public class AccesoActividad {
 // Punto de entrada principal del programa
 public static void main(String[] args) {
 // Guardamos la edad del solicitante en una variable entera
 int edad = 20;
 // Guardamos en una variable booleana que sí tiene el documento de
 // autorización firmado
 boolean autorizacion = true;
 // Evaluamos con && si es mayor de edad Y ADEMÁS tiene autorización,
 // guardando el resultado en 'puedeEntrar'
 boolean puedeEntrar = (edad >= 18) && (autorizacion == true);
 // Imprimimos la edad registrada
 System.out.println("Edad del usuario: " + edad);
 // Imprimimos el estado de su autorización
 System.out.println("¿Tiene autorización?: " + autorizacion);
 // Imprimimos la decisión final calculada (mostrará true)
 System.out.println("¿Acceso permitido al recinto?: " + puedeEntrar);
 // Cerramos el método main
 }
// Cerramos la clase AccesoActividad
}
