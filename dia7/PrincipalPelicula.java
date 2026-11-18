package dia7;


import java.util.Scanner;


public class PrincipalPelicula {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Pelicula[] cartelera={

        

        new Pelicula(null, 0, 0);
        new Pelicula(ET, 120, 0);
        new Pelicula(Coco, 105, 0);
        new Pelicula(Alien, 115, 18);
    };

    
    System.out.print("¿Que edad tienes?");
    int edad = teclado.nextInt();
    int disponibles=0;
    System.out.println("\n----- CARTELERA ------");

    for (int i=0; i<cartelera.length; i++){
        cartelera[i].mostrarFicha();
        if (cartelera[i].puedever(edad)){
        disponibles++;
        } else {
            System.out.println("No recomendada para tu edad");

        }
    }
System.out.println("\nPeliculas que puedes ver: " + disponibles + "de"+cartelera.length);
teclado.close();

}
