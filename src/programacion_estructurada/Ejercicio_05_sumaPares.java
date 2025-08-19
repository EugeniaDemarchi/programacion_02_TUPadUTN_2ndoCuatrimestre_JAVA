
package programacion_estructurada;

import java.util.Scanner;

/**
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
 */
public class Ejercicio_05_sumaPares {

    public static void main (String[] args){
    int suma = sumaDePares();
    System.out.println("La suma de numeros pares es: " + suma);
    }
    
    public static int sumaDePares(){
        Scanner input = new Scanner (System.in);
        int numero;
        int acumulador=0;
        
        System.out.println("Ingresa un numero: (0 para terminar): " );
        numero =input.nextInt();
        
        
        while(numero != 0){
            if (numero%2 == 0){
        acumulador +=numero;}
    System.out.println("Ingresa un numero: (0 para terminar): " );
            numero = input.nextInt();}
    
    return acumulador;
    }
  
}
