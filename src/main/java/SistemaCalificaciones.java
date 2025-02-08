import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa la nota: ");
        var nota = Double.parseDouble(consola.nextLine());

        var calificacion = "";
        //String calificacion = null; -> otra forma de inicializar esta variable usando null

        if (nota >= 9 && nota <= 10)
            calificacion = "A";
        else if (nota >= 8 && nota < 9)
            calificacion = "B";
        else if (nota >= 7 && nota < 8)
            calificacion = "C";
        else if (nota >= 6 && nota < 7)
            calificacion = "D";
        else if (nota >= 0 && nota < 6)
            calificacion = "F";
        else
            calificacion = "Valor Desconocido";

        System.out.printf("Su calificación según su nota %.1f es %s.", nota, calificacion);
    }
}
