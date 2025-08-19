
package programacion_estructurada;

import java.util.Scanner;

/**
Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 
 */
public class Ejercicio_03_clasificacionEdad {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingresa tu edad: ");
    int edad= input.nextInt();
    
    String etapa = clasificacionEdad(edad);
    System.out.println("La etapa de tu vida es: " + etapa);
}

public static String clasificacionEdad(int edad){
        if (edad>=60){
            return "Adulto Mayor";
        } else if (edad>=18){
           return "Adulto";
        } else if (edad>=12){
            return "Adolescente";
        } else {
            return "Niño";
        }
}
}