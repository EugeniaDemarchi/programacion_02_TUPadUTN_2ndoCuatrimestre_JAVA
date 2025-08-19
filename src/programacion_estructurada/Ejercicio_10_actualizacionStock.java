
package programacion_estructurada;

import java.util.Scanner;

/**
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
* 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
 */
public class Ejercicio_10_actualizacionStock {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ingrese el stock actual del producto: ");
    int stockActual= input.nextInt();
     System.out.println("Ingrese la cantidad vendida: ");
     int cantVendida= input.nextInt();
    System.out.println("Ingrese la cantidad recibida: ");
    int cantRecibida =input.nextInt();
    
    
    int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
    System.out.println("el Stock es actualmente: " + nuevoStock);
    
}
public static int actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida){
    int nuevoStock; 
    nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
return nuevoStock;        
}
}
