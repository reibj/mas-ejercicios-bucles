import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*4. Diseña un programa que solicite la nota de los alumnos de la asignatura de
        programación. El usuario tiene que introducir -1 para indicar que ya no hay
        más notas.
        El programa devuelve entonces la media de todas las notas y el número de
        aprobados (>=5)
        Se debe controlar que el usuario introduce números positivos o (-1).
        Si el usuario introduce un número negativo distinto a -1 o un número > 10, el
        programa informa del dato erróneo y solicita una nueva nota hasta que
        esta sea válida.
        Las notas no válidas no se consideran para el cálculo de la media.
        */

        Scanner teclado = new Scanner(System.in);
        double suma_media = 0; 
        int contador_notas = 0; // el numero de notas añdidas para la posterior division de la media
        int aprobados = 0;
        double nota;
        

        System.out.println("Vamos a calcular la media de tus notas");

        do {
            System.out.println("Introduce tu nota de programación");
            nota = teclado.nextDouble();
            
            if (nota>0 && nota<=10){
                suma_media = suma_media + nota;
                contador_notas ++; //para la division
                if (nota >= 5) {
                    aprobados++;
                }
            } else if (nota != -1){
                System.out.println("Nota no válida, inténtalo de nuevo");
            } else if (contador_notas==0){
                System.out.println("Debes introducir al menos una nota");
            }

        } while (nota!=-1 || contador_notas == 0);
        
        
        System.out.println("Tu media es: " + (suma_media/contador_notas) + ", y tu número de aprobados: " + aprobados);
        
        teclado.close();
    }
}
