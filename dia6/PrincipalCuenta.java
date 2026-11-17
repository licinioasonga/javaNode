package dia6;

public class PrincipalCuenta {
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        
        cuenta.ingresar(10);
        cuenta.ingresar(500);
        
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
