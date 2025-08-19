
package programacion_estructurada;

import java.util.Scanner;

/**
 *
Determinar el Mayor de Tres Números. 
Escribe un programa en Java que pida al usuario tres números enteros y 
determine cuál es el mayor.
 */
public class Ejercicio_2_mayorDeTres {
    public static void main (String[] args){
    Scanner input =new Scanner(System.in);
    int[] numeros =new int [3];
    
    System.out.println("Ingresa tres nros: ");
        for (int i = 0; i < 3; i++) {
            numeros[i]=input.nextInt();
        }
      int mayor =mayorDeTres(numeros);
        System.out.println("El mayor numero es " + mayor);
    }

    public static int mayorDeTres(int[] num){
      int mayor = num[0];
        for (int i = 1; i < num.length; i++) {
        if (num[i] > mayor){
         mayor = num[i];
        }
    }
        return mayor;
  
}
}
