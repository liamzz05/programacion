/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej2;

/**
 *
 * @author DAM104
 */
public class Alimento {
    private String nombre;
    private int grasas;
    private int hidratos;
    private boolean origenAnimal;
    private int calorias;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", grasas=" + grasas + ", hidratos=" + hidratos + ", origenAnimal=" + origenAnimal + '}';
    }
    
    private double calorias(int gramos){
        double calorias=gramos*(grasas*5.3+hidratos*2.1);
        return calorias;
    }
    
    private boolean esDietetico(){
        boolean dietetico=false;
        if (calorias<12 && !origenAnimal) {
            dietetico=true;
        }
        return dietetico;
    }
}
