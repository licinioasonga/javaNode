package dia4;

public class EjemploAcumulador {
    
    public static void main(String[] args) {
        
        int suma = 0;
       
        for (int i = 1; i <= 5; i++) {
            
            suma = suma + i;
            
            System.out.println("En la vuelta " + i
                    + ", el acumulador lleva sumado: " + suma);
            
        }
       
        System.out.println("La suma total final es: " + suma);
    }
}
