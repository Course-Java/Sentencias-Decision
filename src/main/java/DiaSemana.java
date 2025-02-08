public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Switch ***");
        var dia = -1; // Suponiendo que 1 - Lunes, 2 - Martes, etc

        /*
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido: " + dia);
                //break;
        }
        */

        // SINTAXIS MEJORADA
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido: " + dia);
        }
    }
}

/*
 * NOTAS:
 * Añadir break a la última sentencia del switch no es necesario, ya que al ser lo último a ejecutar del bloque de código (por ende finalizar ahí), se intuye cómo si fuera un "break" espero me dejo entender
 * La sentencia Switch se corre cómo si fuera en cascada (de arriba hacia abajo buscando el caso que le corresponda ejecutar)
 * Por la razón de arriba es que si no colocamos el break, se va ejecutando lo que se va encontrando en su recorrido de arriba hacia abajo hasta encontrar un break
 * Con la sintaxis mejorada, si queremos que en una variable se guarde un valor que sea regido por un switch, lo puedes hacer inicializando una variable y que esta guarde un switch(variable_a_evaluar) {cases}
 * Con la sintaxis mejorada, si queremos que solo maneje el valor o imprimir directamente en consola, podemos hacerlo cómo la sintaxis general pero ahora usando -> y sin la necesidad de break;
 */