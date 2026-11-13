import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*5. Diseña un programa que solicite cadenas de texto al usuario hasta que la 
        entrada sea el texto ‘salir’, no sensible a mayúsculas. Cuando el usuario 
        termina de introducir las cadenas de texto el programa devuelve: 
        a. Número de palabras que empiezan por A 
        b. Número de palabras que empiezan por M 
        c. Número de palabras que no empiezan por A ni por M.  */

        Scanner teclado = new Scanner(System.in);

        char texto;
        int a = 0;
        int m = 0;
        int otras = 0;

        System.out.println("Introduce una palabra. Para finalizar escribe '-'.");
        do {
            
            texto = teclado.next().charAt(0); //el (0) recoge el primer caracter
            texto = Character.toLowerCase(texto);

            if (texto=='-'){
                break;
            } else if (texto=='m'){
                m ++;
            } else if (texto=='a'){
                a ++;
            } else {
                otras ++;
            }
            
        } while (texto!='-');

        System.out.println("Palabras que empiezan por A: " + a);
        System.out.println("Palabras que empiezan por M: " + m);
        System.out.println("Palabras que no empiezan por A ni por M: " + otras);

        teclado.close();
    }
}
