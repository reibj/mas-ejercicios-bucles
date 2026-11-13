import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*1. Diseña un programa que muestre, para cada número introducido por
        teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá hasta
        que el número introducido sea 0. */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num = teclado.nextInt();
        

        while (num != 0){


            if (num%2==0){
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            if (num>0){
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }

            System.out.println("EL cuadrado de " + num + " es " + Math.pow(num, 2)); // (base, exponente)

            System.out.println("Introduce otro número, para finalizar escribe 0");
            num = teclado.nextInt();
        }

        System.out.println("Adiós");

        teclado.close();
    }
}
