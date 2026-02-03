/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hojafechas.ej1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Letra {
    private int numLetra;
    public String titular;
    private double importe;
    public Calendar fechaVen;

    public Letra() {
        System.out.println("num letra:");
        numLetra=new Scanner(System.in).nextInt();
        System.out.println("titular:");
        titular=new Scanner(System.in).nextLine();
        System.out.println("importe:");
        importe=new Scanner(System.in).nextDouble();
        try{
        System.out.println("fecha vencimiento:");
        fechaVen = Calendar.getInstance(); // le pongo un valor por defecto
        SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy"); // creo un objeto format
        String fechaText=new Scanner(System.in).nextLine(); // leo la fecha como string
        Date d = f.parse(fechaText); // paso el string a date
        fechaVen.setTime(d);  // le asigno al objeto calendar el valor de date
        
        } catch (Exception e){
            System.out.println("formato incorrecto");
        }
    }
    
    public boolean vencida(){
        return (fechaVen.before(Calendar.getInstance()));
    }
    
    public void demora(int num){
        fechaVen.add(Calendar.DAY_OF_MONTH, num);
    }
    
    public int diasFaltan(){
        long diferencia = fechaVen.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
        return (int)(diferencia / (1000 * 60 * 60 *24)); // hay q pasarlo a milisegs porq asi trabaja la clase
    }
    
    public void mostrar(){
        System.out.println("Num letra:"+numLetra+ " Titular:"+titular+" Importe:"+importe+" FechaVen:"+fechaVen.getTime());
    }
}
