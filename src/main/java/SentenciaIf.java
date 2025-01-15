public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia if
        var edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}

/*
 * NOTAS:
 * Un punto de ruptura es un punto donde se detiene la ejecución
 * El modo debug es para presenciar el flujo paso a paso de nuestro código
 */