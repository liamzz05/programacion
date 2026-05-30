/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ej1;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        Hipoteca hipoteca=new Hipoteca(6000,3.5,10);
        System.out.println("CAPITAL:6000   REDITO:3.5%");
        System.out.println("TIEMPO    CUOTA");
        
        for (int i = hipoteca.getTiempo(); i <= 20; i++) {
            System.out.println(hipoteca.getTiempo()+"   "+hipoteca.cuota());
            hipoteca.setTiempo(i+1);
        }
        
    }
}
