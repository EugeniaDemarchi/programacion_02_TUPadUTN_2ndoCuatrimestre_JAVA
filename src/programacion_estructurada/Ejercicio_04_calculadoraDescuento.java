
package programacion_estructurada;

import java.util.Scanner;

/**
Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
 */
public class Ejercicio_04_calculadoraDescuento {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto: ");
        double precio = input.nextDouble();
        System.out.println("Ingrese la categoria del producto: ");
        String categoria = input.next();  
         
        double descuento = descuentoAplicado(precio, categoria);
        double precioFinal = precio - descuento;
        System.out.println("Descuento aplicado: " + (descuento * 100 /precio) + "%");
        System.out.println("PrecioFinal: " + precioFinal);
    }
    
    public static double descuentoAplicado(double precio, String categoria){
        double descuento= 0; 
    
        if (categoria.equalsIgnoreCase("A")){
             descuento = precio * 0.10;
        }
        else if 
                ( categoria.equalsIgnoreCase("B"))
                {
             descuento = precio * 0.15;
        } else if 
                (categoria.equalsIgnoreCase("C")){
             descuento = precio * 0.20;
        }
          else {
                        System.out.println("Ingrese una categoria valida: A, B o C");
                        }
return descuento; 
    }
}    

