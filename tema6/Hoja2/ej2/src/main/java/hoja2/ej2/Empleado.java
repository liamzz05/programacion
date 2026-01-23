/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej2;

/**
 *
 * @author DAM104
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private int edad;
    private boolean casado;
    private double salario; 

    public Empleado() {
    }

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String mostrarClasificacion(){
        String clasificacion="";
        if (edad<=21) {
            clasificacion="Principiante";
        } else if (edad>=22 && edad<=35){
            clasificacion="Intermedio";
        } else {
            clasificacion="Senior";
        }
        return clasificacion;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", departamento=" + departamento + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    public void aumentarSalario(int porcentaje){
        salario+=salario*porcentaje/100;
    }
}
