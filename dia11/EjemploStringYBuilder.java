package dia11;

public class EjemploStringYBuilder {
   
    public static void main(String[] args) {
        
        String nombre = "Ana";
        
        nombre = nombre + " Pérez";
        
        System.out.println("Con String normal: " + nombre);
        
        StringBuilder mensaje = new StringBuilder();
        
             mensaje.append("Resumen del pedido");
        
             mensaje.append(": ");
        
             mensaje.append("3 productos");
        
             mensaje.append(" - ");

             mensaje.append("total 29.95 euros");

        System.out.println("Con StringBuilder: " + mensaje.toString());

    }

}
