/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej1;

/**
 *
 * @author DAM104
 */
public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre{
    private String marca;
    private String modelo;

    public AutoAnfibio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando");
    }

    @Override
    public void andar() {
        System.out.println("Estoy andando");
    }
    
    
}
