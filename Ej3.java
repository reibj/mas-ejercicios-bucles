import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*3. Diseña un programa que calcule el factorial de un número solicitado por
        teclado. Por ejemplo, el factorial del número 7 es = 7x6x5x4x3x2x1 */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número para calcular su factorial");
        int num = teclado.nextInt();
        
        for (int i=num; i>1; i--){
            System.out.print(num + "x");
            num--;
        }
        System.out.print(num); //cuando i=1 lo saco fuera para que no ponga al final '1x'

        teclado.close();
    }
}
