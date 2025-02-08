import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Mayor de dos números ***");

        var consola = new Scanner(System.in);

        System.out.print("Digíte el primer número: ");
        var n1 = Integer.parseInt(consola.nextLine());

        System.out.print("Digíte el segundo número: ");
        var n2 = Integer.parseInt(consola.nextLine());

        System.out.printf("\n%s es mayor.", (n1 > n2) ? "El primer número (" + n1 + ")" : (!(n1 == n2)) ? "El segundo número (" + n2 + ")" : "Ninguno");
    }
}
