import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*2. Diseña un programa que muestre las tablas de multiplicar del 1 al 10. */

        Scanner teclado = new Scanner(System.in);

        //i es el numero de tablas que se calcularan
        for (int i = 1; i<=10; i++){
            System.out.println("Tabla del : " + i);
            
            //j es el numeor de veces que se calcula cada multiplicacion
            for (int j = 1; j<=10; j++){
                int resul = i * j;
            
                System.out.println(i + " x " + j + " = " + resul);
            }
        }

        System.out.println("Adiós");

        teclado.close();
    }
}
