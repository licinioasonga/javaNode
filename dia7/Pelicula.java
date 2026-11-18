package dia7;

public class Pelicula {
     
    private String titulo;
    private int duracion;
    private int edadMinima;
    
    
    public Pelicula (String titulo, int duracion, int edadMinima){

        this.titulo= titulo;
        
        if (duracion <= 0) {
            System.out.println("Aviso: duración incorrecta. Se asignan 90 minutos.");
            this.duracion = 90;
        } else {
            this.duracion = duracion;
        }

            
        if (edadMinima < 0 || edadMinima > 18) {
            this.edadMinima = 18;
        } else {
            this.edadMinima = edadMinima;
        }
    }

    public Pelicula (String titutlo, int duracion){
        this(titutlo, duracion, edadMinima:0);
    }

    public boolean puedeVer(int edad) {
        return edad >= edadMinima;
    }

    public String getDuracionTexto(){
        int horas = duracion / 60;
        int minitos = duracion %60;
        return horas + "h"+ minutos + "min";
    }



    public void mostrarFicha() {

        System.out.println("Datos de la Pelicula");
        System.out.println("=================");
        
        if (edadMinima == 0){calificacion = "Todos los publicos"} 
        else {calificacion + 

        }


        System.out.println("-----------------");

    
}
