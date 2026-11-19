package dia7;

public class Rectangulo {

      // 1. Atributos privados
    private double base;
    private double altura;

    public Rectangulo(double base) {
        this.base = base;
    }

    // 2. Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // 3. Setter para modificar la base
    public void setBase(double base) {
        this.base = base;
    }

    // 4. Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Datos del Rectangulo");
        System.out.println("====================");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("--------------------");
    }
    
}
