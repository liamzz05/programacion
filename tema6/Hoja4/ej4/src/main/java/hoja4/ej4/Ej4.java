/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ej4;

/**
 *
 * @author DAM104
 */
public class Ej4 {

    public static void main(String[] args) {
       /* Instrumento i1= new Flauta();
        Instrumento i2= new Piano();
        i1.tocarNota();
        i2.tocarNota(); */
        
        Instrumento[] instrumentos=new Instrumento[2];
        instrumentos[0]=new Flauta();
        instrumentos[1]=new Piano();
        
        for (Instrumento i : instrumentos) {
            i.tocarNota();
        }
    }
}
