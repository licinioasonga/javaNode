package dia11;

enum EstadoPedido {

    PENDIENTE,

    PREPARANDO,

    ENVIADO,

    ENTREGADO

}

public class EjemploEnum {

    public static void main(String[] args) {

        EstadoPedido estado = EstadoPedido.PREPARANDO;

        System.out.println("Estado actual del envío: " + estado);

        switch (estado) {

            case PENDIENTE:

                System.out.println("Todavía no se ha empezado a empaquetar en " +
                        "el almacén.");

                break;
            case PREPARANDO:

                System.out.println("El pedido se está preparando y empaquetando " +
                        "ahora mismo.");

                break;
            case ENVIADO:

                System.out.println("El pedido ya salió de la tienda y está en " +
                        "reparto.");

                break;
            case ENTREGADO:

                System.out.println("El pedido ya llegó a manos del cliente.");

                break;

        }

    }

}
