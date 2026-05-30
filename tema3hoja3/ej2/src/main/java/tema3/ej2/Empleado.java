/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ej2;

/**
 *
 * @author DAM104
 */
public class Empleado {
    private String nombre;
    private int antiguedad;
    private int horas;
    
    public Empleado(){
        this.nombre="Sinnombre";
    }
    public Empleado(String nombre, int antiguedad, int horas){
        this.nombre=nombre;
        this.antiguedad=antiguedad;
        this.horas=horas;
    }
    public double sueldo(){
        double salario=0;
        if (antiguedad < 10 && antiguedad > 0) {
            salario=12*horas;
        } else if (antiguedad >= 10 && antiguedad < 25) {
            salario=13*horas;
        } else {
            salario =14*horas;
        }
        return salario;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad=antiguedad;
    }
    public int getHoras(){
        return horas;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
}
