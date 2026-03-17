/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo() {
        System.out.println("Introduce el largo");
        this.largo=new Scanner(System.in).nextInt();
        System.out.println("Introduce el ancho");
        this.ancho=new Scanner(System.in).nextInt();
        
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public boolean esAlargado(){
        return largo>=(ancho*2);
    }
    
    public void dibuja(){
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
