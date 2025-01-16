import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");

        var consola = new Scanner(System.in);

        System.out.print("Desear salir del sistema (true / false)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        // Verificamos (aplicando lógica inversa)
        if (!salirSistema) {
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo de sistema...");
        }
    }
}

/*
 * NOTAS:
 * Recordar que las condicionales aceptan cómo condicional el true para que haga lo que indica
 */