/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ej1;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        
        Fecha f= new Fecha(1, 2, 3);
        Hora h= new Hora(12,12);
        Examen e= new Examen("progra","aula d progra", f, h);
        System.out.println(e.toString());
    }
}
