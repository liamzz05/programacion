/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        System.out.println("De que quieres calcular los datos? 1-Cono 2-Cilindro");
        int numero=new Scanner(System.in).nextInt();
        System.out.println("Radio?");
        double radio=new Scanner(System.in).nextDouble();
        System.out.println("Altura?");
        double altura=new Scanner(System.in).nextDouble();
        
        switch (numero) {
            case 1 -> {
                Cono cono=new Cono(radio, altura);
                System.out.println("Area: "+cono.area());
                System.out.println("Volumen: "+cono.volumen());
            }
            case 2 -> {
                Cilindro cilindro=new Cilindro(radio, altura);
                System.out.println("Area: "+cilindro.area());
                System.out.println("Volumen: "+cilindro.volumen());
            }
            default -> System.out.println("valor no valido");
        }
    }
}
