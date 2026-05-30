/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ej4;

/**
 *
 * @author DAM104
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public boolean horavalida(){
        boolean valida=true;
        if (!(hora>=0 && hora<24)) {
            valida=false;
        }
        if (!(minuto<60 && minuto>=0)) {
            valida=false;
        }
        if (!(segundo<60 && segundo>=0)) {
            valida=false;
        }
        return valida;
    }
    
    public void horaMenos(){
        if (segundo>0) {
            this.segundo--;
        } else if (minuto>0) {
            this.segundo=59;
            this.minuto--;
        } else {
            this.segundo=59;
            this.minuto=59;
            this.hora--;
        }
    }
    
    public void horaMas(){
        if (segundo<59) {
            this.segundo++;
        } else if (minuto<59) {
            this.segundo=0;
            this.minuto++;
        } else {
            this.segundo=0;
            this.minuto=0;
            this.hora++;
        }
    }
    
    public void mostrar24(){
        System.out.println("Hora: "+hora+":"+minuto+":"+segundo);
    }
    
    public void mostrar12(){
        String horario;
        int horaCambio=hora;
        if (hora>11) {
            horaCambio-=12;
            horario="PM";
        } else {
            horario="AM";
        }
        System.out.println("Hora: "+horaCambio+":"+minuto+":"+segundo+" "+horario);
    }
}
