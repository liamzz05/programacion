/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examenu2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        boolean salir = false; // centinela para repetir el bucle hasta q se quiera salir
        double peso = 0;
        double altura = 0;
        char genero = 'a';
        double imc = 0;

        do {
            System.out.println("Seleccione una opcion:\n1- Introducir datos\n2- Mostrar datos del paciente\n3- Calcula IMC con 2 decimales\n4- Mostrar diagnostico\n5- Salir");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    do{              //pide los valores uno por uno hasta que sean validos
                    System.out.println("Dime la altura: (en metros)");
                    altura = new Scanner(System.in).nextDouble();
                    } while(altura<=0);
                    do{
                        System.out.println("Dime el peso: ");
                        peso= new Scanner(System.in).nextDouble();
                    }while (peso<=0);
                    do{
                        System.out.println("Dime el genero(h o m): ");
                        genero= new Scanner(System.in).nextLine().charAt(0); //lee el siguiente string q se escriba y coge solo el primer caracter introducido
                    }while (genero!='h' && genero!='m'); //recoge el caracter (repite hasta que sea uno de esos dos)
                  
                }
                case 2 ->
                    System.out.println("Peso: " + peso + "; Altura: " + altura + "; Genero: " + genero + "; IMC: " + imc);  //imprime los datos
                case 3 ->
                    imc = peso / (Math.pow(altura, 2));   //calcula imc
                case 4 -> {
                    if ((imc < 21 && genero == 'm') || (imc < 22 && genero == 'h')) {    //comprueba siguiendo los valores de la tabla
                        System.out.println("Infrapeso");
                    } else if ((imc >= 21 && imc <= 24 && genero == 'm') || (imc >= 22 && imc <= 25 && genero == 'h')) {
                        System.out.println("Peso ideal");
                    } else {
                        System.out.println("Sobrepeso");
                    }
                }
                case 5 ->
                    salir = true; //cambia el boolean para salir del bucle
                default-> System.out.println("Valor no valido");
            };

        } while (!salir);

    }
}
