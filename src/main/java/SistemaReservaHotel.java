import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        var consola = new Scanner(System.in);

        System.out.print("Nombre del Cliente: ");
        var nombre = consola.nextLine();

        System.out.print("Días de estadía: ");
        var dias = Integer.parseInt(consola.nextLine());

        System.out.print("¿Con vista al mar? (false/true): ");
        var tieneVistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = (!tieneVistaMar) ? TARIFA_DIARIA_SIN_VISTA_MAR * dias : TARIFA_DIARIA_CON_VISTA_MAR * dias;
        var mensajeVistaMar = (tieneVistaMar) ? "Sí :)" : "No :(";

        System.out.printf("""
                \n--------- Detalles de la Reservación ---------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombre, dias, costoTotal, mensajeVistaMar);
    }
}
