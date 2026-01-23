/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej2;

/**
 *
 * @author DAM104
 */
public class Plantilla {

    private int contador;
    private Empleado[] empleados;

    public Plantilla(Empleado[] empleados) {
        this.contador = 0;
        this.empleados = new Empleado[20];
    }

    public boolean insertar(Empleado empleado) {
        empleados[contador] = empleado;
        return empleados[contador] == empleado;
    }

    public String infoEmpleados() {
        String info = "";
        for(Empleado empleado : empleados){
            info.concat(empleado.toString());
        }
        return info;
    }

    public Empleado masLineas() {
        Programador mejor = new Programador();
        for (Empleado empleado : empleados) {
            if (empleado instanceof Programador) {
                if (mejor.getLineasDeCodigoPorHora() > ((Programador) empleado).getLineasDeCodigoPorHora()) {
                    mejor = (Programador) empleado;
                }
            }
        }
        return mejor;
    }

    public String empleadoSenior() {
        String seniors = "";
        for (Empleado empleado : empleados) {
            if (empleado.mostrarClasificacion() == "Senior") {
                seniors.concat(empleado.toString());
            }
        }
        return seniors;
    }
    
    public void aumentoSueldo(){
        for (Empleado empleado : empleados) {
            if (empleado instanceof Programador) {
                Programador prog=(Programador)empleado;
                if (prog.mostrarClasificacion()=="Intermedio" && prog.getLenguajeDominante()=="Java") {
                    empleado.aumentarSalario(20);
                }
            }
        }
    }
}
