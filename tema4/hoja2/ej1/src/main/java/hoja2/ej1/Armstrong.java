/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej1;

/**
 *
 * @author DAM104
 */
public class Armstrong {
    public static boolean esArmstrong(int num){
        boolean Armstrong=false;
        int cifra1= num/100;
        int cifra2= (num/10)%10;
        int cifra3= num%10;
        
        if ( (Math.pow(cifra1, 3) + Math.pow(cifra2, 3) + Math.pow(cifra3, 3)) == num) {
            Armstrong=true;
        }
        return Armstrong;
    }
}
