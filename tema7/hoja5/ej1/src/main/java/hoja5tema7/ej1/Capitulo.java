/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5tema7.ej1;

/**
 *
 * @author DAM104
 */
public class Capitulo {
    private int numTemp;
    private int numCap;
    private String desc;

    public Capitulo(int numTemp, int numCap, String desc) {
        this.numTemp = numTemp;
        this.numCap = numCap;
        this.desc = desc;
    }

    public int getNumTemp() {
        return numTemp;
    }

    public int getNumCap() {
        return numCap;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "numTemp=" + numTemp + ", numCap=" + numCap + ", desc=" + desc + '}';
    }
    
    
}
