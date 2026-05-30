/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.guille_munoz_examenu3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Guille_munoz_examenU3 {

    public static void main(String[] args) {
        /* PRUEBAS
        Sanitario s1 = new Sanitario("Holaoo", 1999, Categoria.ENFERMERO);
        System.out.println(s1.getClave());
        System.out.println(s1.toString());
        */
        boolean salir = false;
        do {
            System.out.println("1.Pedir datos del empleado\n2.Añadir un sanitario\n3.Mostrar datos del empleado\n4.Mostrar sueldo\n5.Mostrar cadena de Ullman\n6.Salir");
            int opcion = new Scanner(System.in).nextInt();
            String nombre="";
            int anno=0;
            int categoria=0;
            Sanitario s1=null;
            Categoria cat = null;
            
            switch (opcion) {  //menu repetitivo
                case 1 -> {
                    System.out.println("Dime el nombre del empleado");
                    nombre = new Scanner(System.in).nextLine();
                    do {
                        System.out.println("Dime el año de nacimiento");
                        anno = new Scanner(System.in).nextInt();
                        if (anno < 1900 || anno > 2024) {   // si no esta en el rango digo q hay un error
                            System.out.println("Dato invalido");
                        }
                    } while (anno < 1900 || anno > 2024); // compruebo q sea un año valido con un rango q considero aceptable
                    do {
                        System.out.println("Dime la categoria (1=auxiliar, 2=enfermero, 3=medico)");
                        categoria = new Scanner(System.in).nextInt();
                    } while (categoria < 1 || categoria > 3);
                    
                    
                    
                }
                case 2 -> {
                   
                      // me complique haciendo un enum asiq aqui le doy valor a la variable enum dependiendo de el numero escogido
                    if (categoria==1) {
                        cat=(Categoria.AUXILIAR);
                    } else if (categoria==2) {
                        cat=(Categoria.ENFERMERO);
                    } else if (categoria==3){
                        cat=(Categoria.MEDICO);
                    }
                    s1=new Sanitario(nombre,anno,cat);
                    if (s1==null) {
                        System.out.println("Es nulo");
                    }
                    System.out.println(s1.toString()); // !! problema: sigue sin crear el objeto 
                }
                case 3 -> {
                    if (s1==null) {
                        System.out.println("No hay sanitario"); // comnpruebo q exista el objeto e imprimo el to string si es asi
                    } else {
                    System.out.println(s1.toString());
                    }
                }
                case 4 -> {
                    if (s1==null) {
                        System.out.println("No hay sanitario");
                    } else {
                        System.out.println("Numero de hijos?");
                        int num=new Scanner(System.in).nextInt();
                        System.out.println("Sueldo del empleado: "+s1.calcularSueldo(num));
                    }
                }
                case 5 -> {
                    if (s1==null) {
                        System.out.println("No hay sanitario");
                    } else {
                        System.out.println(s1.conjeturaDeUllman());
                    }
                }
                case 6 ->{
                    salir = true;
                }
            }
        } while (!salir);
    }
}
