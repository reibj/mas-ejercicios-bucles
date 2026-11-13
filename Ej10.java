import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        /* 10. Desarrolla un programa que convierta un número decimal en su 
        representación binaria. Ten en cuenta que el procedimiento para convertir 
        un número en base decimal a base binaria consiste en dividir 
        sucesivamente el número entre 2 y registrar los restos. */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero decimal para transformarlo a binario");
        int num = teclado.nextInt();
        int cociente = num / 2;
        int resto;

        while (cociente!=0){
            resto = num % 2; // calculamos el resto que será parte del num binario
            cociente = num / 2; 
            System.out.print(resto); //vamos imprimiendo los restos
            num = cociente; //actualizamos el numero, que será el cociente de la división anterior
            //System.out.println(cociente);
        }
        
        teclado.close();
    }
}
