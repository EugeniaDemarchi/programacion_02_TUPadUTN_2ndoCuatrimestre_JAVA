package programacion_estructurada;
import java.util.Scanner;

/**
 * Verificación de Año Bisiesto. 
 * Escribe un programa en Java que solicite al usuario un año y determine si es 
 * bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
 * divisible por 400. 
 */
public class Ejercicio_01_esBisiesto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un año: ");
        int anio = input.nextInt();

        if (esBisiesto(anio)) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
    }

    public static boolean esBisiesto(int numero) {
        return (numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0); 
    }
}




