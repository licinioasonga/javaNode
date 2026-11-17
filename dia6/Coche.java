package dia6;


public class Coche {

    // Atributos privados
    private String marca;
    private String modelo;
    private int kilometros;

    // Método para asignar la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para asignar el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para recorrer kilómetros
    public void recorrerKilometros(int distancia) {

        if (distancia > 0) {
            this.kilometros += distancia;
            System.out.println("Se han recorrido " + distancia + " km.");
        } else {
            System.out.println("Error: la distancia debe ser mayor que 0.");
        }
    }

    // Método para mostrar los datos del coche
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("--------------------------");
    }
}
