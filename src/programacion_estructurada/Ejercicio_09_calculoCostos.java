
package programacion_estructurada;

import java.util.Scanner;

/**
 *
9. Composición de funciones para calcular costo de envío y total de compra.
* 
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
* 
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
* 
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
* 
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
 */
public class Ejercicio_09_calculoCostos {
public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    
    System.out.println("Ingresa el precio del producto: ");
    double precio = input.nextDouble();
    
    System.out.println("Ingresa el peso del paquete en kg: ");
    double peso=input.nextDouble();
    
    System.out.println("Ingresa la zona de envio: Nacional/ Internacional: ");
    String zona = input.next();
    
    
    double costoEnvio = calcularCostoEnvio(peso, zona);
    double totalCosto =  calcularTotalCompra(precio, costoEnvio);
    
    System.out.println("El costo del envio es de: " + costoEnvio);
    System.out.println("El costo total es: " + totalCosto);
    
}

public static double calcularCostoEnvio(double peso, String zona){
    double costoEnvio = 0;
   
   if (zona.equalsIgnoreCase("Nacional")){
        costoEnvio= peso * 5;
   } else if (zona.equalsIgnoreCase("Internacional")) {
        costoEnvio = peso * 10;
   } else {
       System.out.println("Ingresa un area valida: Nacional/Internacional");
   }
return costoEnvio;
}

public static double calcularTotalCompra(double precioProducto, double costoEnvio){
    double totalCompra = costoEnvio + precioProducto;
    return totalCompra; 
}
}
