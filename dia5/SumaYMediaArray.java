package dia5;

public class SumaYMediaArray {
 // Inicia la ejecución del programa
 public static void main(String[] args) {

 int[] notas = {6, 8, 5, 9, 7};
 
 int suma = 0;

 for (int i = 0; i < notas.length; i++) {

 suma += notas[i];

 }
 
 double media = (double) suma / notas.length;
 
 System.out.println("Suma total de las notas: " + suma);

 System.out.println("Nota media exacta: " + media);

 }

}