import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        /* 11. Escribe un programa que incremente la hora de un reloj. Se pedirán por 
        teclado la hora, minutos y segundos (por separado). También se solicita 
        cuántos segundos se desea incrementar la hora. La aplicación mostrará la 
        nueva hora (hh:mm:ss). Por ejemplo, si las 13:59:51 se incrementa en 10s, se 
        obtiene 14:00:01  */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las horas (hh)");
        int hh = teclado.nextInt();
        while (hh<0 || hh>23){ // si pone una hora negativa o mayor que 23, error hasta q lo ponga bien
            System.out.println("Formato no válido, introduce otro");
            hh = teclado.nextInt();
        }
        
        System.out.println("Introduce los minutos (mm)");
        int mm = teclado.nextInt();
        while (mm<0 || mm>59){ // si pone minutos negativos o mayor que 59, error hasta q lo ponga bien
            System.out.println("Formato no válido, introduce otro");
            mm = teclado.nextInt();
        }

        System.out.println("Introduce los segundos (ss)");
        int ss = teclado.nextInt();
        while (ss<0 || ss>59){ // si pone segundos negativos o mayor que 59, error hasta q lo ponga bien
            System.out.println("Formato no válido, introduce otro");
            ss = teclado.nextInt();
        }

        System.out.printf("%02d:%02d:%02d%n", hh, mm, ss);


        System.out.println("Ahora introduce los segundos que quieres avanzar en el tiempo");
        int segAvanzados = teclado.nextInt();

        ss = ss + segAvanzados;
        
        while (ss>=60){
            ss = ss - 60;
            mm++;
        }
        while (mm>=60){
            mm = mm - 60;
            hh++;
        }
        while (hh>=24){
            hh = hh - 24;
        }
            
         


        System.out.printf("%02d:%02d:%02d", hh, mm, ss);

        teclado.close();
    }
}
