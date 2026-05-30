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
        Empleado Juan=new Empleado();
        Juan.setAntiguedad(3);
        Juan.setNombre("Juan");
        Juan.setHoras(100);
        System.out.println("Datos de "+Juan.getNombre()+":\nHoras: "+Juan.getHoras()+"\nAntiguedad: "
                +Juan.getAntiguedad());
        System.out.println("Dime el nombre:");
        String nombre=new Scanner(System.in).nextLine();
        System.out.println("Dime la antiguedad:");
        int antiguedad=new Scanner(System.in).nextInt();
        System.out.println("Dime las horas:");
        int horas=new Scanner(System.in).nextInt();
        Empleado Pepe=new Empleado(nombre,antiguedad,horas);
        System.out.println("Datos de "+Pepe.getNombre()+":\nHoras: "+Pepe.getHoras()+"\nAntiguedad: "
                +Pepe.getAntiguedad());
    }
}
