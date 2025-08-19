
package programacion_estructurada;

import java.util.Scanner;

/**
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
etc
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 */
public class Ejercicio_06_contadores {
public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    int contadorPositivos, contadorNegativos, contadorCeros, numero;

    contadorPositivos = 0;
    contadorNegativos = 0;
    contadorCeros = 0;
    
    for (int i = 0; i < 10; i++) {
    System.out.println("Ingresa el numero " + (i + 1)+ ":");
    numero = input.nextInt();
    
        if (numero == 0){
            contadorCeros ++;
        } else if (numero > 0){
            contadorPositivos++; 
        } else {
        contadorNegativos++; }
    }
           System.out.println("La cantidad de numeros positivos es: " + contadorPositivos); 
           System.out.println("La cantidad de numeros negativos es: " + contadorNegativos); 
           System.out.println("La cantidad de ceros es: " + contadorCeros); 
}
}
