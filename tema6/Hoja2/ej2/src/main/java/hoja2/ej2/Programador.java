/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej2;

/**
 *
 * @author DAM104
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora= 0;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String departamento, int edad, boolean casado, double salario) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    
}
