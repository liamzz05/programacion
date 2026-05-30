/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operadoresaritmeticos;

/*
OperadoresAritmeticos.java
Programa que muestra el uso de los operadores aritméticos
 */
public class OperadoresAritmeticos {

    public static void main(String[]args) { //faltaba el void
        short x = 7;
        int y = 5;
        float f1 = 13.5f; //netbeans me hace castearlo o poner la f 
        float f2 = 8f;
        System.out.println("El valor de x es "+ x+ " y el valor de y es "+ y); // cambiar las comas por +
        System.out.println("El resultado de x + y es " + (x + y)); //falta ;
        System.out.println("El resultado de x - y es " + (x - y));
        System.out.printf("%s%s\n", "División entera:", "x / y = %d", (x / y)); //%d para imprimir un entero, quitar un \n pq arriba hay un println
        System.out.println("Resto de la división entera: x % y = " + (x % y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n", f1, f2);
        System.out.println("El resultado de f1 / f2 es " + (f1 / f2)); //falta ;
    }
}
