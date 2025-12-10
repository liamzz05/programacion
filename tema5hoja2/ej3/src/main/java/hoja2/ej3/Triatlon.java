/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Triatlon {
    private int dorsal;
    private String nombre;
    private int[] resultados;

    public Triatlon(int dorsal, String nombre, int numero) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.resultados = new int[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Dime el resultado "+ (i+1) +":");
            resultados [i]=new Scanner(System.in).nextInt();
        }
    }

    public Triatlon() {
        System.out.println("Introduce el dorsal: ");
        this.dorsal=new Scanner(System.in).nextInt();
        System.out.println("Introduce el nombre: ");
        this.nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce el numero de resultados: ");
        int numero=new Scanner(System.in).nextInt();
        this.resultados=new int[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("Dime el resultado "+ (i++) +":");
            resultados [i]=new Scanner(System.in).nextInt();
        }
    }
    
    public double pMedia(){
        double media=0;
        for (int i = 0; i < resultados.length; i++) {
            media+=resultados[i];
        }
        return media/resultados.length;
    }
    
    public boolean esSeleccionado(){
        boolean seleccionado=false;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i]>10) {
                seleccionado=true;
            }
        }
        return seleccionado;
    }

    public void mostrar(){
        System.out.println("Dorsal="+dorsal);
        System.out.println("Nombre="+nombre);
        System.out.printf("Puntos=");
        for (int i = 0; i < resultados.length; i++) {
            
            if (i<resultados.length-1) {
                System.out.printf(resultados[i]+", ");
            } else {
                System.out.printf(resultados[i]+" ");
            }
        }
        System.out.println("\nMedia="+this.pMedia());
        
    }
}
