/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej1;

/**
 *
 * @author DAM104
 */
public class Cono extends Figura {

    public Cono(double radio, double altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
        double g=Math.sqrt(Math.pow(radio, 2)+Math.pow(altura, 2)); // generatriz
        //return (Math.PI*radio*g)+(Math.PI*Math.pow(radio, 2));
        return Math.PI*radio*(g+radio);
    }

    @Override
    public double volumen() {
        return (1.0/3)*(Math.PI*Math.pow(radio, 2)*altura);
    }
}
