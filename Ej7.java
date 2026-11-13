import java.util.*;

public class Ej7 {
    public static void main(String[] args) {
        /*7. Codifica el juego «el número secreto», que consiste en acertar un número 
        entre 1 y 100 (generado aleatoriamente). El usuario va introduciendo 
        números por teclado y el programa responde «mayor» o «menor», según sea
        mayor o menor con respecto al número secreto. El proceso termina cuando 
        el usuario acierta o cuando se rinde (introduciendo un −1).   */

        Scanner teclado = new Scanner(System.in);

        // para 1-100 : ( ... * 100) + 1 (+1 para que no salga el 0)
        int numSecreto = (int) (Math.random() * 100) + 1;
        int numUsuario;
    

        System.out.println("El número secreto");
        System.out.println("Adivina el número secreto del 1 al 100, para rendirte escribe '-1'");
        numUsuario = teclado.nextInt();

        //mientras no acierte y no se rinda, el prgrama dira si el num es mayor o menor
        while (numUsuario!=numSecreto && numUsuario!= -1) {
            System.out.println("Incorrecto");
            if (numSecreto>numUsuario){
                System.out.println("El número secreto es mayor");
            } else if (numSecreto<numUsuario){
                System.out.println("El número secreto es menor");
            }

            numUsuario = teclado.nextInt();
        }

        //si se rinde se revela el numero, si lo acierta felicita
        if (numUsuario==-1){
            System.out.println("Te has rendido, el número era: " + numSecreto);
        } else {
            System.out.println("Felicidades, has acertado: " + numSecreto);

        }

        teclado.close();
    }
}
