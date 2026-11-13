import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        /*
         * 8. Desarrolla un programa que solicite un número entero y dibuje un triángulo
         * rectángulo de n elementos asterisco (*) de lado. Por ejemplo, para n = 4
         * * * *
         * * *
         * *
         *
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Valor no válido");
        } else {
            for (int i = n; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*"); // para que escriba las estrellas seguidas
                }
                System.out.println(); // para que salte de linea y escriba la siguiente fila de estrellas
            }
        }

        teclado.close();
    }
}
