import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var CORRECT_USER = "admin";
        final var CORRECT_PASSWORD = "123";

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        var contrasena = consola.nextLine();

        /*
        if (usuario.equals(CORRECT_USER) && contrasena.equals(CORRECT_PASSWORD))
            System.out.println("¡Bienvenido al sistema!");
        else if (usuario.equals(CORRECT_USER))
            System.out.println("Contraseña incorrecta.");
        else if (contrasena.equals(CORRECT_PASSWORD))
            System.out.println("Usuario incorrecto.");
        else
            System.out.println("Contraseña y Usuario incorrectos.");
        */

        switch (usuario) {
            case CORRECT_USER -> {
                if (contrasena.equals(CORRECT_PASSWORD))
                    System.out.println("¡Bienvenido al sistema!");
                else
                    System.out.println("Contraseña incorrecta.");
            }
            default -> {
                if (contrasena.equals(CORRECT_PASSWORD))
                    System.out.println("Usuario incorrecto.");
                else
                    System.out.println("Contraseña y Usuario incorrectos.");
            }
        }
    }
}
