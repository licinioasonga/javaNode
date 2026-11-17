package dia6;

public class Rectangulo {

    // Atributos privados
    private double base;
    private double altura;

    // Setter para asignar la base
    public void setBase(double base) {

        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Error: la base debe ser mayor que 0.");
        }
    }

    // Setter para asignar la altura
    public void setAltura(double altura) {

        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Error: la altura debe ser mayor que 0.");
        }
    }

    // Método para calcular el área
    public double getArea() {
        return base * altura;
    }

    // Método para calcular el perímetro
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    // Método para calcular la diagonal
    public double getDiagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    // Método para comprobar si es un cuadrado
    public boolean esCuadrado() {

        if (base == altura) {
            return true;
        } else {
            return false;
        }
    }
}
