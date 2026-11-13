import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        /*
         * 9. Para dos números dados, a y b, es posible buscar el máximo común divisor
         * (el número más grande que divide a ambos) con el siguiente algoritmo:
         * desde el menor de a y b, ir buscando, de forma decreciente, el primer
         * número que divide a ambos simultáneamente. Realiza un programa que
         * calcule el máximo común divisor de dos números siguiendo este
         * procedimiento.
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 2 números para calcular el máximo común divisor de ambos.");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int resto1;
        int resto2;


        if (num1==num2){
            System.out.println("El MCD de " + num1 + " y " + num2 + " es el mismo número");

            } else if (num1<num2){ //si num1 es menor, empezamos buscando por ese hacia abajo, ya que el mcd no podria ser mayor que el num mas pequeño

                for (int i=num1; i>=1; i--){
                    resto1 = num1 % i; //calculamos los divisores de ambos numeros
                    resto2 = num2 % i;

                    if (resto1==0 && resto2==0){ //al empezar de arriba a abajo, el 1º en coincidir será el mcd
                        System.out.println("El MCD de " + num1 + " y " + num2 + " es " + i);
                        break;
                    }
                }
            } else {

                for (int i=num2; i>=1; i--){
                    resto1 = num1 % i; //calculamos los divisores de ambos numeros
                    resto2 = num2 % i;

                    if (resto1==0 && resto2==0){ //al empezar de arriba a abajo, el 1º en coincidir será el mcd
                        System.out.println("El MCD de " + num1 + " y " + num2 + " es " + i);
                        break;
                    }
                }
            }

        teclado.close();
    }
}
