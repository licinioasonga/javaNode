package dia6;

public class Cuenta {

    private double saldo;

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
