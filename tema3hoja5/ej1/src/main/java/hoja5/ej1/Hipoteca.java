/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ej1;

/**
 *
 * @author DAM104
 */
public class Hipoteca {
    private double capital;
    private double redito;
    private int tiempo;

    public Hipoteca(double capital, double redito, int tiempo) {
        this.capital = capital;
        this.redito = redito;
        this.tiempo = tiempo;
    }
    
    public double cuota(){
        return capital*redito*tiempo/100;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    @Override
    public String toString() {
        return "hipoteca{" + "capital=" + capital + ", redito=" + redito + ", tiempo=" + tiempo + '}';
    }
    
}
