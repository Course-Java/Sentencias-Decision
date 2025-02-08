import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("Digíte un mes (1 al 12): ");
        var mes = Integer.parseInt(consola.nextLine());

        /*
        var estacion = "";

        if (mes == 1 || mes == 2 || mes == 12)
            estacion = "Invierno";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Otoño";
        else
            estacion = "Estación desconocida: " + mes;

        // Imprimimos el resultado
        System.out.printf("La estación para el mes %d es %s", mes, estacion);
        */

        // VERSIÓN MEJORADA
        var estacion = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación desconocida: " + mes;
        };

        // Imprimimos el resultado
        System.out.printf("La estación para el mes %d es %s", mes, estacion);
    }
}
