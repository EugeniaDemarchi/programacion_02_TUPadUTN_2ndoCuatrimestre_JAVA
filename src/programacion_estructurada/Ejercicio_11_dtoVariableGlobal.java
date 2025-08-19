
package programacion_estructurada;

import java.util.Scanner;

/**
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
 */
public class Ejercicio_11_dtoVariableGlobal {

    static double descuento = 0.10;
    
    public static void main(String[] arg){
    Scanner input = new Scanner (System.in);

    System.out.println("Ingrese el precio del producto: ");
    double precio = input.nextDouble();
    
    calcularDescuentoEspecial(precio);

}
public static double calcularDescuentoEspecial(double precio){
    double descuentoAplicado= precio * descuento;
    double precioFinal = precio - descuentoAplicado;
    
    System.out.println("El descuento especial es: " + descuentoAplicado);
    System.out.println("El precio final es: " + precioFinal);
        return 0;
    }
}