import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuentos ***");

        final var VALOR_MINIMO = 1000.00;

        int descuento;
        float montoDescuento, montoFinal;

        var consola = new Scanner(System.in);

        System.out.print("Cuál fue el monto de tu compra? ");
        var monto = Float.parseFloat(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true / false)? ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        if (monto >= VALOR_MINIMO && esMiembro) {
            descuento = 10;

        } else if (esMiembro) {
            descuento = 5;

        } else {
            descuento = 0;
        }

        if (descuento != 0) {
            montoDescuento = monto * ((float) descuento / 100);
            montoFinal = monto - montoDescuento;

            System.out.printf("""
                \nFelicidades, has obtenido un descuento del %d%%
                Monto de la compra: $%.2f
                Monto del descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, descuento, monto, montoDescuento, montoFinal);
        } else {
            System.out.printf("""
                \nNo obtuviste ningún tipo de descuento
                Si quieres obtener diferentes tipos de descuento, ¡Hazte miembro!
                Monto final de la compra: $%.2f
                """, monto);
        }
    }
}
