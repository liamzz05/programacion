/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej2;

/**
 *
 * @author DAM104
 */
public class Pajaro {
    private String color;
    private int edad;
    private static int numPajaros=0;
    
    public void nuevoPajaro(){
        numPajaros+=1;
    }
    
    public Pajaro(){
        nuevoPajaro();
    }
        
    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
        nuevoPajaro();
    }
    
    public static void MuestraPajaro(){
        System.out.println("num pajaros: "+numPajaros);
    }
}
