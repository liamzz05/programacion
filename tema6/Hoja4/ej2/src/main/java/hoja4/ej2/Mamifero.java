/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej2;

/**
 *
 * @author DAM104
 */
public class Mamifero {
    private String raza;
    private int patas;
    private String alimento;

    public Mamifero(String raza, int patas, String alimento) {
        this.raza = raza;
        this.patas = patas;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", patas=" + patas + ", alimento=" + alimento + '}';
    }
    
    
}
