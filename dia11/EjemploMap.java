package dia11;

import java.util.HashMap;

public class EjemploMap {

    public static void main(String[] args) {

        HashMap<String, Double> precios = new HashMap<String, Double>();

        precios.put("Pan", 1.20);

        precios.put("Leche", 0.95);

        precios.put("Arroz", 1.10);

        System.out.println("Precio del pan: " + precios.get("Pan") + " €");

        System.out.println("Todos los precios del mapa: " + precios);

    }

}
