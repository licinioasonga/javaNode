

public class CuentaSimple {
    
    private double saldo;
    
    public CuentaSimple(double saldoInicial) {
      
        this.saldo = saldoInicial;

    }
   
    public void retirar(double cantidad) {
       
        if (cantidad < 0) {
            
            throw new IllegalArgumentException("La cantidad a retirar no puede " +
                    "ser negativa.");
        
        }
        // Si la cantidad es positiva pero supera el dinero disponible:
        if (cantidad > this.saldo) {
            // Avisamos normalmente por pantalla
            System.out.println("Saldo insuficiente para realizar la retirada.");
        // Si la cantidad es positiva y hay saldo suficiente:
        } else {
            // Descontamos el dinero del saldo de la cuenta
            this.saldo = this.saldo - cantidad;
            // Confirmamos el nuevo saldo
            System.out.println("Retirada realizada. Nuevo saldo disponible: "
                    + this.saldo + " €");
        // Cierra el if-else de saldo
        }
    // Cierra el método retirar
    }
    // Método principal para poner a prueba nuestra cuenta
    public static void main(String[] args) {
        // Creamos una cuenta con 100 euros iniciales
         CuentaSimple cuenta = new CuentaSimple(100.0);
        // Retirada válida: deja el saldo en 70 euros
        cuenta.retirar(30.0);
        // Segunda retirada válida: deja el saldo en 50 euros
        cuenta.retirar(20.0);
        // Vigilamos una retirada con un dato ilegal
        try {
            // Cantidad negativa: el método lanza la IllegalArgumentException
            cuenta.retirar(-5.0);
            // Se salta porque la excepción interrumpe el try
            System.out.println("Esta línea no llega a ejecutarse.");
        // Atrapamos exactamente el tipo de excepción que lanzó el método
        } catch (IllegalArgumentException e) {
            // getMessage() devuelve el texto que escribimos en el throw new
            System.out.println("Operación rechazada: " + e.getMessage());
        // Cierra el try-catch
        }
        // main está dentro de la propia clase, por eso puede leer el atributo
        // private
        System.out.println("El programa sigue. Saldo final: " + cuenta.saldo
                + " €");
    // Cierra el método main
    }
// Cierra la clase CuentaSimple
}