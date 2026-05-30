/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Circulo c2= new Circulo(10);
        System.out.println("Dime un valor");
        double valor=new Scanner(System.in).nextInt();
        Circulo c3= new Circulo(valor);
        c1.setRadio(5);
        System.out.println("Nuevo valor de c1: "+c1.getRadio());
        System.out.println("Valor de c3: "+c3.getRadio());
        System.out.println("Area de c2: "+c2.area());
        System.out.println("Area de c3: "+c3.area()+" Longitud de c3: "+c3.longitud());
    }
}
