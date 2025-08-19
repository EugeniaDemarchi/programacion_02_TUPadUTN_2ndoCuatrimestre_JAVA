
package programacion_estructurada;

import java.util.Scanner;

/**
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
 */
public class Ejercicio_08_precioFinal {
public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    
    System.out.println("Ingresa el precio base de tu producto: ");
    double precioBase=input.nextDouble();
    
    System.out.println("Ingresa el impuesto en porcentaje: ");
    double porcentajeImpuesto = input.nextDouble();
    
    System.out.println("Ingresa el porcentaje de descuento: ");
    double porcentajeDescuento= input.nextDouble();
    
    double pFinal= calcularPrecioFinal(precioBase, porcentajeImpuesto, porcentajeDescuento);
    System.out.println("El precio final del producto es: $" + pFinal);
}
public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
    double desc = descuento / 100;
    double imp = impuesto / 100;
    double PrecioFinal = precioBase + (precioBase * imp) - (precioBase * desc);
return PrecioFinal;
    }
}
