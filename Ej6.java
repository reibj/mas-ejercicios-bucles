import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*6. Implementa una aplicación para calcular datos estadísticos de las edades 
        de los alumnos de un centro educativo. Se introducirán edades hasta que 
        una de ellas sea negativa. El programa mostrará: la suma de todas las 
        edades introducidas, la media, el número de alumnos y cuántos son 
        mayores de edad.   */

        Scanner teclado = new Scanner(System.in);

        int edad;
        int suma_edades = 0;
        int num_edades = 0;
        int mayores_edad = 0;

        System.out.println("Introduce las edades de los alumnos hasta que una sea negativa para salir.");

        do {
            edad = teclado.nextInt();

            //ponemos un if edad>0 a pesar de ya estar puesto en while y que al realizarse 1ro la accion
            //cuando pongamos un num negativo para salir, esta 'edad negativa' tambien se sumaria
            //no queremos eso, asi q para evitarlo pongo un if.
            if (edad>0){
                suma_edades = suma_edades + edad;
            num_edades ++;
            }
            
            if (edad>=18){
                mayores_edad ++;
            }
            
        } while (edad>=0);

        //imprimo resultados
        System.out.println("Suma de todas la edades: " + suma_edades);
        System.out.println("Media: " + (double)suma_edades/num_edades);
        System.out.println("Numero de alumnos: " + num_edades);
        System.out.println("Mayores de edad: " + mayores_edad);


        teclado.close();
    }
}
