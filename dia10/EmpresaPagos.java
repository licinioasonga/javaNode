// Contrato común para cualquier colaborador al que la empresa tenga que pagar a
// fin de mes

interface Pagable {
    // Debe devolver el importe a pagar
    double calcularPago();

    // Debe devolver un texto identificando al trabajador
    String getDescripcion();
    // Cierra la interfaz Pagable
}

// Trabajador con sueldo fijo mensual
class EmpleadoFijo implements Pagable {
    // Nombre del empleado
    private String nombre;
    // Sueldo fijo
    private double sueldoMensual;

    public EmpleadoFijo(String nombre, double sueldoMensual) {
        // Guarda el nombre
        this.nombre = nombre;
        // Guarda el sueldo
        this.sueldoMensual = sueldoMensual;
        // Cierra constructor
    }

    @Override
    // Devuelve su sueldo fijo
    public double calcularPago() {
        return this.sueldoMensual;
    }

    @Override
    // Devuelve descripción
    public String getDescripcion() {
        return "Empleado fijo: " + this.nombre;
    }
    // Cierra EmpleadoFijo
}

// Colaborador externo que cobra por horas trabajadas
class RepartidorPorHoras implements Pagable {
    // Nombre del repartidor
    private String nombre;
    // Horas trabajadas
    private int horas;
    // Tarifa por hora
    private double precioHora;

    public RepartidorPorHoras(String nombre, int horas, double precioHora) {
        // Guarda nombre
        this.nombre = nombre;
        // Guarda horas
        this.horas = horas;
        // Guarda tarifa
        this.precioHora = precioHora;
        // Cierra constructor
    }

    @Override
    // Multiplica horas por tarifa
    public double calcularPago() {
        return this.horas * this.precioHora;
    }

    @Override
    // Devuelve descripción
    public String getDescripcion() {
        return "Repartidor por horas: "
                + this.nombre;
    }
    // Cierra RepartidorPorHoras
}

// Clase principal que une Polimorfismo con Arrays, for e if (archivo
// EmpresaPagos.java)
public class EmpresaPagos {
    // Inicia el programa
    public static void main(String[] args) {
        // Array polimórfico del tipo de la interfaz Pagable
        Pagable[] trabajadores = new Pagable[3];
        // Casilla 0: empleada fija
        trabajadores[0] = new EmpleadoFijo("Ana", 1400.0);
        // Casilla 1: repartidor (1000€)
        trabajadores[1] = new RepartidorPorHoras("Luis", 80, 12.5);
        // Casilla 2: repartidora (660€)
        trabajadores[2] = new RepartidorPorHoras("Marta", 60, 11.0);
        // Recorremos todo el array con un bucle
        for (int i = 0; i < trabajadores.length; i++) {
            // POLIMORFISMO: cada objeto usa su propia fórmula
            double pago = trabajadores[i].calcularPago();
            // Muestra resultado
            System.out.println(trabajadores[i].getDescripcion() + " | Pago: "
                    + pago + " €");
            // Cierra el bucle for
        }
        // Cierra el método main
    }
    // Cierra la clase EmpresaPagos
}
