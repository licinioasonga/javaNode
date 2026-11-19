package evaluacion_Licinio_Garcia;

public class PrincipalEvaluacion {
     public static void main(String[] args){

        ProductoServidor p1 = new ProductoServidor("Servidor Torre Pro", 1200.0, 5);
        ProductoServidor p2 = new ProductoServidor("Router WiFi 6", 60.0);

 
    System.out.println("=== INVENTARIO INICIAL ===");
    p1.mostrarFicha();
    p2.mostrarFicha();

    System.out.println("\n=== PRUEBA DE VENTAS ===");
    p1.vender(2);
    p2.vender(25);


    System.out.println("\n=== REPOSICIÓN ===");
    p1.reponerStock(4);


    System.out.println("\n===INVENTARIO FINAL==="); 
    p1.mostrarFicha();
    p2.mostrarFicha();   

     }

}

