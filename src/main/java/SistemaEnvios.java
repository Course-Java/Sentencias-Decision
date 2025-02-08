import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envios ***");

        final var COSTO_TARIFA_NACIONAL = 10.0;
        final var COSTO_TARIFA_INTERNACIONAL = 20.0;

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso = Float.parseFloat(consola.nextLine());

        var costoEnvio = switch (destino) {
            case "nacional" -> peso * COSTO_TARIFA_NACIONAL;
            case "internacional" -> peso * COSTO_TARIFA_INTERNACIONAL;
            default -> null;
        };

        if (costoEnvio != null) {
            System.out.printf("El costo de envío del paquete es $%.2f.\n", costoEnvio);
        }
        else
            System.out.println("Por favor, ingrese correctamente los campos.");
    }
}

/*
 * NOTAS:
 * Dentro de switch, podemos usar directamente default -> null cuando queremos retornar al valor un null o podemos usar default -> { ...(otras sentencias)... yield null } cuando queremos agrupar múltiples sentencias y luego devolver un valor null a la variable con yield
 * O sea si existe la necesidad de usar un bloque de código y querer retornar un null cuando no se cumplieron los otros casos (default) usamos yield null después de las sentencias dadas dentro del bloque.
 * Las funciones trim y strip eliminan espacios en blanco iniciales y finales de una cadena. La diferencia entre ambas es que trim elimina un solo espacio en blanco inicial y final, mientras que strip elimina todos los espacios en blanco.
 */