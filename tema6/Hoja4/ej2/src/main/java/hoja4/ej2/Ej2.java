/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ej2;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        Gato gato= new Gato("manu","calico",5,"almas");
        System.out.println(gato.toString());
        System.out.println(gato.arañar()+gato.obedecer());
    }
}
